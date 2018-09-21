package qTESLA;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

public class RandomNumberGenerator {
	
	public static final int RANDOM_NUMBER_GENERATOR_SUCCESS				= 0;
	public static final int RANDOM_NUMBER_GENERATOR_BAD_MAXIMUM_LENGTH	= -1;
	public static final int RANDOM_NUMBER_GENERATOR_BAD_OUTPUT_BUFFER	= -2;
	public static final int RANDOM_NUMBER_GENERATOR_BAD_REQUEST_LENGTH	= -3;
	
	private AdvancedEncryptionStandard256CounterDeterministicRandomBitGenerator drbgse;
	
	public RandomNumberGenerator () {
		
		this.drbgse = new AdvancedEncryptionStandard256CounterDeterministicRandomBitGenerator();
		
	}
	
	/************************************************************************************************************************************************************
	 * Description:	Advanced-Encryption-Standard-256-Application in Electronic Code Book Mode
	 * 
	 * @param		key:			256-Bit Advanced-Encryption-Standard Key
	 * @param		plaintext:		128-Bit Plaintext Value
	 * @param		ciphertext:		128-Bit Ciphertext Value
	 * 
	 * @return		none
	 ************************************************************************************************************************************************************/
	private void advancedEncryptionStandard256ElectronicCodeBook (byte[] key, byte[] plaintext, byte[] ciphertext, int ciphertextOffset)
				
			throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, ShortBufferException  {
		
		Cipher cipher = Cipher.getInstance ("AES/ECB/PKCS5Padding");
		
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
		
		cipher.update (plaintext, 0, 16, ciphertext, ciphertextOffset);
		
	}
	
	private void advancedEncryptionStandard256CounterDeterministicRandomBitGeneratorUpdate (byte[] providedData, byte[] key, byte[] value)
					
			throws	BadPaddingException, InvalidKeyException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, ShortBufferException {
		
		byte[] temporary = new byte[48];
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 15; j >= 0; j--) {
				
				if (value[j] == (byte) 0xFF) {
					
					value[j] = (byte) 0x00;
					
				} else {
					
					value[j]++;
					
					break;
					
				}
				
			}
			
			advancedEncryptionStandard256ElectronicCodeBook (key, value, temporary, 16 * i);
			
		}
		
		if (providedData != null) {
			
			for (int i = 0; i < 48; i++) {
				
				temporary[i] ^= providedData[i];
				
			}
			
		}
		
		System.arraycopy (temporary,	0,	key,	0,	32);
		System.arraycopy (temporary,	32, value,	0,	16);
		
	}
	
	/***************************************************************************************************************************************************************
	 * Description:	Initiate the seed expander
	 * 
	 * @param		stateOfSeedExpander:	Current state of an instance of the seed expander
	 * @param		seed:					32-byte random value
	 * @param		diversifier:			8-byte diversifier
	 * @param		maximumLength:			Maximum number of bytes generated under "seed" and "diversifier"
	 * 
	 * @return		RANDOM_NUMBER_GENERATOR_SUCCESS
	 ***************************************************************************************************************************************************************/
	public int initiateSeedExpander (
			
			AdvancedEncryptionStandardExtendableOutputFunction stateOfSeedExpander,
			byte[] seed,
			byte[] diversifier,
			long maximumLength
	
	) {
		
		if (maximumLength >= 0x100000000L) {
			
			return RANDOM_NUMBER_GENERATOR_BAD_MAXIMUM_LENGTH;
			
		}
		
		stateOfSeedExpander.setRemainingLength (maximumLength);
		stateOfSeedExpander.setKey (seed, 0, 32);
		stateOfSeedExpander.setPlaintext (diversifier, 0, 8);
		stateOfSeedExpander.setPlaintextElement (11, (byte) (maximumLength & 0xFFL));
		maximumLength >>>= Byte.SIZE;
		stateOfSeedExpander.setPlaintextElement (10, (byte) (maximumLength & 0xFFL));
		maximumLength >>>= Byte.SIZE;
		stateOfSeedExpander.setPlaintextElement (9,	 (byte) (maximumLength & 0xFFL));
		maximumLength >>>= Byte.SIZE;
		stateOfSeedExpander.setPlaintextElement (8,	 (byte) (maximumLength & 0xFFL));
		stateOfSeedExpander.setPlaintext (12, 4, (byte) 0x00);
		stateOfSeedExpander.setBufferPosition (16);
		stateOfSeedExpander.setBuffer (0, 16, (byte) 0x00);
		
		return RANDOM_NUMBER_GENERATOR_SUCCESS;
		
	}
	
	/***************************************************************************************************************************************************************
	 * Description:	Seed expander
	 * 
	 * @param		stateOfSeedExpander:			Current state of an instance of the seed expander
	 * @param		extendableOutputFunctionData:	Data of the extendable output function
	 * @param		numberOfByteToReturn
	 * 
	 * @return		RANDOM_NUMBER_GENERATOR_SUCCESS
	 * 				RANDOM_NUMBER_GENERATOR_BAD_OUTPUT_BUFFER
	 * 				RANDOM_NUMBER_GENERATOR_BAD_REQUEST_LENGTH
	 ***************************************************************************************************************************************************************/
	public short seedExpander (AdvancedEncryptionStandardExtendableOutputFunction stateOfSeedExpander, byte[] extendableOutputFunctionData, int numberOfByteToReturn)
				 
				 throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, ShortBufferException {
		
		int offset = 0;
		
		if (extendableOutputFunctionData == null) {
			
			return RANDOM_NUMBER_GENERATOR_BAD_OUTPUT_BUFFER;
			
		}
		
		if (numberOfByteToReturn >= stateOfSeedExpander.getRemainingLength()) {
			
			return RANDOM_NUMBER_GENERATOR_BAD_REQUEST_LENGTH;
			
		}
		
		stateOfSeedExpander.setRemainingLength (stateOfSeedExpander.getRemainingLength() - numberOfByteToReturn);
		
		while (numberOfByteToReturn > 0) {
			
			if (numberOfByteToReturn <= (16 - stateOfSeedExpander.getBufferPosition())) {
				
				System.arraycopy (
						
						stateOfSeedExpander.getBuffer(),	stateOfSeedExpander.getBufferPosition(),
						extendableOutputFunctionData,		offset,
						numberOfByteToReturn
				
				);
				
				stateOfSeedExpander.setBufferPosition (stateOfSeedExpander.getBufferPosition() + numberOfByteToReturn);
				
				return RANDOM_NUMBER_GENERATOR_SUCCESS;
				
			}
			
			System.arraycopy (
					
					stateOfSeedExpander.getBuffer(),	stateOfSeedExpander.getBufferPosition(),
					extendableOutputFunctionData,		offset,
					16 - stateOfSeedExpander.getBufferPosition()
			
			);
			
			numberOfByteToReturn	-= 16 - stateOfSeedExpander.getBufferPosition();
			offset					+= 16 - stateOfSeedExpander.getBufferPosition();
			
			advancedEncryptionStandard256ElectronicCodeBook (
					
					stateOfSeedExpander.getKey(), stateOfSeedExpander.getPlaintext(), stateOfSeedExpander.getBuffer(), (short) 0
			
			);
			
			stateOfSeedExpander.setBufferPosition (0);
			
			/* Increment the counter */
			for (int i = 15; i >= 12; i--) {
				
				if (stateOfSeedExpander.getPlaintextElement (i) == 0xFF) {
					
					stateOfSeedExpander.setPlaintextElement (i, (byte) 0x00);
					
				} else {
					
					stateOfSeedExpander.setPlaintextElement (i, (byte) (stateOfSeedExpander.getPlaintextElement(i) + 1));
					
					break;
					
				}
				
			}
			
		}
		
		return RANDOM_NUMBER_GENERATOR_SUCCESS;
		
	}
	
	public void initiateRandomByte (byte[] entropyInput, byte[] personalizationString, int securityStrength)
				
				throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, ShortBufferException {
		
		byte[] seedMaterial = new byte[48];
		
		System.arraycopy (entropyInput, 0, seedMaterial, 0, 48);
		
		if (personalizationString != null) {
			
			for (int i = 0; i < 48; i++) {
				
				seedMaterial[i] ^= personalizationString[i];
				
			}
			
		}
		
		this.drbgse.setKey		(0, 32, (byte) 0x00);
		this.drbgse.setValue	(0, 16, (byte) 0x00);
		
		advancedEncryptionStandard256CounterDeterministicRandomBitGeneratorUpdate (seedMaterial, this.drbgse.getKey(), this.drbgse.getValue());
		
		this.drbgse.setReseedCounter (1);
		
	}
	
	public int randomByte (byte[] extendableOutputFunctionData, int extendableOutputFunctionDataOffset, int numberOfByteToReturn)
				
				 throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, ShortBufferException {
		
		byte[] block = new byte[16];
		int i		 = 0;
		
		while (numberOfByteToReturn > 0) {
			
			for (int j = 15; j >= 0; j--) {
				
				if (this.drbgse.getValueElement (j) == (byte) 0xFF) {
					
					this.drbgse.setValueElement (j, (byte) 0x00);
					
				} else {
					
					this.drbgse.setValueElement (j, (byte) (this.drbgse.getValueElement (j) + 1));
					
					break;
					
				}
				
			}
			
			advancedEncryptionStandard256ElectronicCodeBook (this.drbgse.getKey(), this.drbgse.getValue(), block, 0);
			
			if (numberOfByteToReturn > 15) {
				
				System.arraycopy (block, 0, extendableOutputFunctionData, extendableOutputFunctionDataOffset + i, 16);
				i += 16;
				numberOfByteToReturn -= 16;
				
			} else {
				
				System.arraycopy (block, 0, extendableOutputFunctionData, extendableOutputFunctionDataOffset + i, numberOfByteToReturn);
				numberOfByteToReturn = 0;
				
			}
			
		}
		
		advancedEncryptionStandard256CounterDeterministicRandomBitGeneratorUpdate (null, this.drbgse.getKey(), this.drbgse.getValue());
		
		this.drbgse.setReseedCounter (this.drbgse.getReseedCounter() + 1);
		
		return RANDOM_NUMBER_GENERATOR_SUCCESS;
		
	}
	
}