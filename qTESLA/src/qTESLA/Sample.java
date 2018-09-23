package qTESLA;

import java.util.Arrays;

public class Sample {

	public static final double[][] EXPONENTIAL_DISTRIBUTION_I = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9991161986946362635440596569713669685880,
				0.9982331784940198897326533185472850242681,		0.9973509387078094832208641647995024627420,
			    0.9964694786462737732901278365428682898391,		0.9955887976202910746192912304685682364684,
			    0.9947088949413487485322425364041275159470,		0.9938297699215426647216913224142898699467,
			    0.9929514218735766634486778457089421310313,		0.9920738501107620182173911392473163552182,
			    0.9911970539470168989248757955220583150316,		0.9903210326968658354852077402726923030103,
			    0.9894457856754391819277196598158280316812,		0.9885713121984725809688571162894359262234,
			    0.9876976115823064290572467553909520317038,		0.9868246831438853418915583811441525830737,
			    0.9859525262007576204107430418579502424629,		0.9850811400710747172562296407417980684195,
			    0.9842105240735907037056629536175321639825,		0.9833406775276617370777663048165281180240,
			    0.9824715997532455286079125206742780153835,		0.9816032900709008117939871480322018994711,
			    0.9807357478017868112121282928289778252539,		0.9798689722676627118019278012111954856228,
			    0.9790029627908871286206788726159970207714,		0.9781377186944175770662555609768519653065,
			    0.9772732393018099435682099865780080346346,		0.9764095239372179567466734471337520306711,
			    0.9755465719253926590386479823956917338692,		0.9746843825916818787912753119951161678163,
			    0.9738229552620297028216704313083937453701,		0.9729622892629759494429075148916109501561
			},
			
			{
				1.0000000000000000000000000000000000000000,		0.9721023839216556419557461414665235406759,
			    0.9449830448261659815506003316741838244400,		0.9186202706410607262354282576433721865857,
			    0.8929929550089316248724185119772265808860,		0.8680805803894262140332557150199116840610,
			    0.8438632016326556552525292339254629390907,		0.8203214300108653339129866284361494061943,
			    0.7974364176955837811756247839373545193403,		0.7751898426678221357270891859654278174299,
			    0.7535638940492430676420382969418743828861,		0.7325412578425551199256826085929390870521,
			    0.7121051030697160541445567434958450232311,		0.6922390682968472772769625589791250165011,
			    0.6729272485350710325059754287002821864844,		0.6541541825067830050114340006988959714053,
			    0.6359048402671655658518413475133857442506,		0.6181646111710312869993190871292294307424,
			    0.6009192921753628362027560473439879450541,		0.5841550764681841229558144388281781547134,
			    0.5678585424146588316121044339920926624110,		0.5520166428115664537913591359859590337117,
			    0.5366166944415528229941896994764026030425,		0.5216463679187921574527288412861688503326,
			    0.5070936778179309248395866416383933681722,		0.4929469730784106413269415008349571859159,
			    0.4791949276764871892092025854239549577609,		0.4658265315574785583888478629564160135480,
			    0.4528310818209812590638301874088128310074,		0.4401981741519981827475211630454194703175,
			    0.4279176944911175684463420329167665844223,		0.4159798109370741180402885145593642305967
			},
			
			{
				1.0000000000000000000000000000000000000000000,	0.4043749658752093528844267111687024946352000,
			    0.1635191130265767286466168121241953230561000,	0.0661230357500664658125158195755369905396800,
			    0.0267385003249983751901792656444280328199900,	0.0108123801564754921591274701439625558225200,
			    0.0043722558568045679050942770881717978898840,	0.0017680308128930313775416921539090938672610,
			    0.0007149473996299382156691604651236075335476,	0.0002891068303279259298899010575129069771848,
			    0.0001169075646481449883075929977115181069539,	4.727449246514746096480558381507760086106E-5,
			    1.911662127736184620584353997559933697984E-5,	7.730283076682497589319888445443844075884E-6,
			    3.125932955339193327950538126733860718160E-6,	1.264049032143478624120751312511989786231E-6,
			    5.111497842376105790435567936679525625580E-7,	2.066961765582044014739815034159084709228E-7,
			    8.358275934226015223807850299656474431551E-8,	3.379877545678228479840194532767858969538E-8,
			    1.366737867196019982379028600007217696759E-8,	5.526745784077469928250904895328215282900E-9,
			    2.234877637837284060764188149247765384222E-9,	9.037285685357202289540219994637413662239E-10,
			    3.654452090620836644843916087377680577752E-10,	1.477768939437388295908878759559360151466E-10,
			    5.975727644564382090472646695947245344300E-11,	2.416434662350267172894275660335977107355E-11,
			    9.771456841275623229028471594408844775750E-12,	3.951332526741911117382517682123044657845E-12,
			    1.597819955662865055885641210966604195704E-12,	6.461183900458995781949987131389237968733E-13,	    
			}
			
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_III_SIZE = {
			/* [3][32] */
			{
			    1.0000000000000000000000000000000000000000,		0.9930872609369466438446685776045870783769,
			    0.9862223078352471514816645800946617163753,		0.9794048103630198064987096277024276745233,
			    0.9726344404718809949964892248205218503718,		0.9659108723811599790550031774166135553877,
			    0.9592337825622227893519943162404944070569,		0.9526028497229044826212304268593937992247,
			    0.9460177547920490148527778717375614297184,		0.9394781809041559863157234389191387682224,
			    0.9329838133841335196263226397557142740444,		0.9265343397321565371915254554479065418152,
			    0.9201294496086297094295001392864839167637,		0.9137688348192543502053861599866811078566,
			    0.9074521893001985409223010760173581553575,		0.9011792091033697696748437406081452352264,
			    0.8949495923817893768052167676933918240273,		0.8887630393750681031008720036903279549798,
			    0.8826192523949820417374995711487459848121,		0.8765179358111482999024679709014128311544,
			    0.8704587960367996808317122241155297845427,		0.8644415415146577017577899722859465798926,
			    0.8584658827029032679986111034824856707621,		0.8525315320612443281154225239327537518954,
			    0.8466382040370798397352222582144291697216,		0.8407856150517593802671106888137768620013,
			    0.8349734834869377413443844341919836129518,		0.8292015296710238503946615698754495016414,
			    0.8234694758657233672792155446698925939247,		0.8177770462526743084502076388248436931084,
			    0.8121239669201750555508610480023292486879,		0.8065099658500041098290290520491383950857
			},
			
			{
			    1.000000000000000000000000000000000000000000,	0.800934772904330958149289147678835379231900,
			    0.641496510447312204373499372783656047282400,	0.513796861914038772364949444572425393537500,
			    0.411517772916078536172101376437287950148600,	0.329598893996635399379754662490773377965600,
			    0.263987215312713825982276019476435177163800,	0.211436540346135168277271109902967378463200,
			    0.169346877425809181204329018414432119905300,	0.135635802813098047385468189533424706641600,
			    0.108635430923805298713642166033938136474100,	0.087009894196322129633888643223500462265840,
			    0.069689249848561129123901308446212969572380,	0.055816543501330488571168943765317728506110,
			    0.044705410593542844825537482958021104962770,	0.035806117881334109889089225809702563468820,
			    0.028678364893872039251073895095820247481830,	0.022969499673540939157364159160888757126060,
			    0.018397071004753616184652396727769205113000,	0.014734853887297189343899420600727064173260,
			    0.011801656852000872577486157077858160324500,	0.009452357350652160270369000159777795264839,
			    0.007570721688055171417140197893346564436337,	0.006063654255944361840448638204382454042975,
			    0.004856591544455177358529410131498186861861,	0.003889813045747301426610201899960753418453,
			    0.003115486528435918796419578590889832746504,	0.002495301495139325055182486610241845985297,
			    0.001998573736337252813277171935604760180550,	0.001600727201645837799022382894438631230426,
			    0.001282078077731994286308984939556462536997,	0.001026860914033896017267762777785748817307
			},
			
			{
				1.000000000000000000000000000000000000000,		0.0008224486129860722211363916637848860326918,
			    6.764217210027140041831031984333572710182E-7,	5.563221062323340498274022484847072751687E-10,
			    4.575463446442734637606790950284979597994E-13,	3.763083565295300843546185184301854315545E-16,
			    3.094942858827803718449578214814971509997E-19,	2.545431461514076294341840669798321223682E-22,
			    2.093486574973362721749187178812187137854E-25,	1.721785129891805064378362119288044621215E-28,
			    1.416079791939559272724577415918469648772E-31,	1.164652860758296257488258742700152576162E-34,
			    9.578671299409218577167988854386920292388E-38,	7.877964924448609922540282389759450919100E-41,
			    6.479221325265686467208309495512157540942E-44,	5.328826592194544529621668305843636827587E-47,
			    4.382686039593701056175477296603487664723E-50,	3.604534054417261435200071909889027197334E-53,
			    2.964544033516540037422419325585053196748E-56,	2.438185128501814352606789000040829068102E-59,
			    2.005281977139585478986634802357029989886E-62,	1.649241380744420660650718985253047314575E-65,
			    1.356416286072483410597007136332173243839E-68,	1.115582693112033332431603568345878366580E-71,
			    9.175094386212588788144072292603516054032E-75,	7.546043651956841286284539906283246167227E-78,
			    6.206233135084259224486265414976130044209E-81,	5.104307833818251594629732382370662953839E-84,
			    4.198030898177763847327057349990235798892E-87,	3.452664689478976857663267096113988698397E-90,
			    2.839639284967972258959000310917203801857E-93,	2.335457391302670665789857816505217149076E-96
			}
			
			
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_III_SPEED = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9951980443443537316500388424172839303752,
			    0.9904191474668262564830185894967173613892,		0.9856631986401875746675941557587114196642,
			    0.9809300876689149347041557365309129923940,		0.9762197048866395987965541168345276706016,
			    0.9715319411536058687432894158212596709598,		0.9668666878541423134736924881553750396380,
			    0.9622238368941451396373408016639000521875,		0.9576032806985736469363056351479270970296,
			    0.9530049122089577101698314104664824876542,		0.9484286248809172302397073765744987564880,
			    0.9438743126816934966419131566675496907225,		0.9393418700876924042461092785035073150884,
			    0.9348311920820394674392081270253399758265,		0.9303421741521465749826061515830447550861,
			    0.9258747122872904292046909607697858626672,		0.9214287029762026134209634491584644007645,
			    0.9170040432046712317435415947941667461407,		0.9126006304531540657099452867877830194818,
			    0.9082183626944031924279067014123113094560,		0.9038571383911010091985145255388756529519,
			    0.8995168564935076098442888811876009946339,		0.8951974164371194582318032579854959087286,
			    0.8908987181403393047402262055905414183192,		0.8866206620021572916876550405654798379036,
			    0.8823631488998431939863624175501337704454,		0.8781260801866497415560803096876886684788,
			    0.8739093576895269702812107160640808580937,		0.8697128837068475485533842136704059167642,
			    0.8655365610061430266950922187780245940470,		0.8613802928218509568132024098758678171240
			},
			    
			{
				1.000000000000000000000000000000000000000000,	0.857243982853072830883035055416073116703300,
			    0.734867246137799425692104349091725698937400,	0.629960524947436582383605303639195946052600,
			    0.540029869446153084936465415644391919699900,	0.462937356143645214602345480384983067321600,
			    0.396850262992049868687926409818180089809000,	0.340197500043594241063920093831306311583500,
			    0.291632259894029145223423158665267961335500,	0.250000000000000000000000000000097352251700,
			    0.214310995713268207720758763854101733807800,	0.183716811534449856423026087273002965715400,
			    0.157490131236859145595901325909860314588700,	0.135007467361538271234116353911150553048700,
			    0.115734339035911303650586370096290834824400,	0.099212565748012467171981602454583656718920,
			    0.085049375010898560265980023457859696888520,	0.072908064973507286305855789666345381391030,
			    0.062500000000000000000000000000048676125830,	0.053577748928317051930189690963546297109930,
			    0.045929202883612464105756521818268626674130,	0.039372532809214786398975331477480410666060,
			    0.033751866840384567808529088477800781543110,	0.028933584758977825912646592524083975704600,
			    0.024803141437003116792995400613655572746400,	0.021262343752724640066495005864473203970290,
			    0.018227016243376821576463947416593443112050,	0.015625000000000000000000000000018253547190,
			    0.013394437232079262982547422740891790191980,	0.011482300720903116026439130454571627979850,
			    0.009843133202303696599743832869373935671238,	0.008437966710096141952132272119453481206014
			},
			
			{
			    1.000000000000000000000000000000000000000,		0.007233396189744456478161648131023810675775,
			    5.232202043780962102557587008169005410143E-5,	3.784659032745836912993682954976324658164E-7,
			    2.737593822694567686662466634421542264066E-9,	1.980210072614684707158711353745069372717E-11,
			    1.432364399414465384287735340977513952565E-13,	1.036085918905020069841154248521752033776E-15,
			    7.494419938055456100418425186702743722723E-18,	5.421010862427522170037264004417260251684E-20,
			    3.921231931684654880817938739668273317360E-22,	2.836382411375207747860568187463889509638E-24,
			    2.051667772709962123314993704273413823620E-26,	1.484052584974173558955043468582713624191E-28,
			    1.073474031353259824558654154333806911547E-30,	7.764862968180290824468612020607860317513E-33,
			    5.616633020792314645332222710264644852793E-35,	4.062733189179202535382045195211707654781E-37,
			    2.938735877055718769921841343128853888538E-39,	2.125704089576016965228859756656407540404E-41,
			    1.537605986206336992222535387300608525931E-43,	1.112211328195318530448364746285024038827E-45,
			    8.045065183558638234146057828832053516826E-48,	5.819314384499884015403474144560288801662E-50,
			    4.209340649576656799996170991423257963815E-52,	3.044782861598424467581974062513986546956E-54,
			    2.202412074968526631812431321732133496007E-56,	1.593091911132452277028880397827266782094E-58,
			    1.152346495989819456843455045622426762614E-60,	8.335378753358135655955994470664225877261E-63,
			    6.029309691461763611680553229574282672923E-65,	4.361238574900884540660050746922306538111E-67,
			}
			
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_P = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9930924954370359015332102168880765048173,
			    0.9862327044933591729073804985266878802443,		0.9794202975869268710835182321094224250961,
			    0.9726549474122855185227020947295413763023,		0.9659363289248455510651443129204733029988,
			    0.9592641193252643901322834293949397264660,		0.9526379980439373889289005948680289570903,
			    0.9460576467255959075051119972754354254470,		0.9395227492140117766851490088262829075331,
			    0.9330329915368074159813432661499603336007,		0.9265880618903708756879317851202732375877,
			    0.9201876506248750783904312382017973974891,		0.9138314502294005401326428921359892449876,
			    0.9075191553171608564550809482180658363403,		0.9012504626108302434560060155923701020040,
			    0.8950250709279724289295293992056807493013,		0.8888426811665701935046683790031660959701,
			    0.8827029962906548665450116490541232503509,		0.8766057213160350863710299119436526437378,
			    0.8705505632961241391362700174797799990040,		0.8645372313078651954249311342751209858410,
			    0.8585654364377537683418658040230197384022,		0.8526348917679567215371033354114150564474,
			    0.8467453123625271602457822707284519309456,		0.8408964152537145430311254762332558266219,
			    0.8350879194283693564930171007187976000468,		0.8293195458144416997480650199452263126561,
			    0.8235910172675731299989737240342361894393,		0.8179020585577811249918276889374069238047,
			    0.8122523963562355226097093827753290960475,		0.8066417592221263022701629871861700330324
			},
			
			{
				1.000000000000000000000000000000000000000000,	0.801069877589622077182576980035615205902700,
			    0.641712948781452099037917089781420222618900,	0.514056913328033254673172479396413573907600,
			    0.411795508633786564999486862017198273163900,	0.329876977693223564843500492807512798916800,
			    0.264254510140345093624873553521627364440900,	0.211686328090631790061445567682195415303500,
			    0.169575540930958985396762834141244920349500,	0.135841857815757262606900740466230788178000,
			    0.108818820412015517392033752185036062422000,	0.087171479146900338767218235365499637556050,
			    0.069830446129513747913186914700207350540810,	0.055939066932998276808095587450398613186620,
			    0.044811101500494605684562734558780780465070,	0.035896823593657343962457092086843785683310,
			    0.028755864082027346199700976193834163154190,	0.023035456520173456442055699495851578765410,
			    0.018453010334836412492976026695119689178670,	0.014782150730087436054767374957445947431420,
			    0.011841535675862485018337967197721359270050,	0.009485897534336303604787967133085469399049,
			    0.007598866776658480613458610115084898737984,	0.006087223278597655149117219956228990612855,
			    0.004876291206646921576592633968279399063782,	0.003906250000000000000000000000006084516053,
			    0.003129179209334461238994441328268996020587,	0.002506691206177547261866863631962577257343,
			    0.002008034817687629901067079997645368310618,	0.001608576205600728769529245554757186330929,
			    0.001288581944114154550169923800031354012535,	0.001032244180235723021972162318445464753156
			},
			
			{
				1.000000000000000000000000000000000000000,		0.0008268997191040304299275217487598638498908,
			    6.837631454543244275598561791827450446268E-7,	5.654035529098691704742888887601969318770E-10,
			    4.675320390815916240837145591289455678271E-13,	3.866021117887026910581260785663924052584E-16,
			    3.196811776431032265107748321378670183434E-19,	2.643442759959277106397015416454182808165E-22,
			    2.185862075677909177530183421677021601630E-25,	1.807488736378216004902267757945329990433E-28,
			    1.494611928394845722509566662381681852231E-31,	1.235894183759231170477230799378805483584E-34,
			    1.021960553392813221805059629881904702629E-37,	8.450588945359167454685108853553438401193E-41,
			    6.987789625181120323479538530531788834637E-44,	5.778201278220326478541087516212630539830E-47,
			    4.777993013886937548374901071454718579294E-50,	3.950921081064128423947108109095179681258E-53,
			    3.267015532134120033414586853048549151733E-56,	2.701494225830208356330596231491229575841E-59,
			    2.233864816500159437321055999997722887780E-62,	1.847182189280358319436455385107649366142E-65,
			    1.527434433449896263866613728025637317872E-68,	1.263035103969543081968346060350962609985E-71,
			    1.044403372690945043917523022329044283453E-74,	8.636168555094444625386351863230863826745E-78,
			    7.141245352342656606906053992842560076147E-81,	5.905093775905105564186232605424573035226E-84,
			    4.882920384578890205960673105845289217904E-87,	4.037685494415628551550334502904113261957E-90,
			    3.338761001162701476381524668052565130775E-93,	2.760820534016929266476966660680800456743E-96
			}
	
	};
	
	public static final long[][] CUMULATIVE_DISTRIBUTION_TABLE_I = {
			/* [12][2] */
			{0x0200000000000000L, 0x0000000000000000L},	{0x0300000000000000L, 0x0000000000000000L},
			{0x0320000000000000L, 0x0000000000000000L}, {0x0321000000000000L, 0x0000000000000000L},
			{0x0321020000000000L, 0x0000000000000000L},	{0x0321020100000000L, 0x0000000000000000L},
			{0x0321020100200000L, 0x0000000000000000L},	{0x0321020100200100L, 0x0000000000000000L},
			{0x0321020100200100L, 0x0200000000000000L},	{0x0321020100200100L, 0x0200010000000000L},
			{0x0321020100200100L, 0x0200010000200000L},	{0x0321020100200100L, 0x0200010000200001L},	
			
	};
	
	public static final long[][] CUMULATIVE_DISTRIBUTION_TABLE_III = {
			/* [14][3] */
			{0x0000020000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000030000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032100000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000002000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000002000001L}
			
	};
	
	private static long modulus7 (long number) {
		
		long temporary = number;
		
		for (int i = 0; i < 2; i++) {
			
			temporary = (temporary & 7) + (temporary >> 3);
			
		}
		
		return ((temporary - 7) >> 3) & temporary;
		
	}
	
	/******************************************************************************************************************
	 * Description:	Samples Polynomial Y, Such That Each Coefficient is in the Range [-B, B]
	 * 
	 * @param		Y				Polynomial Y
	 * @param		seed			Kappa-Bit Seed
	 * @param		seedOffset		Starting Point of the Kappa-Bit Seed
	 * @param		nonce			Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n				Polynomial Degree
	 * @param		q				Modulus
	 * @param		b				Determines the Interval the Randomness is Chosen in During Signing
	 * @param		bBit			b = 2 ^ bBit - 1
	 * 
	 * @return		none		
	 ******************************************************************************************************************/
	public static void sampleY (long[] Y, final byte[] seed, int seedOffset, int nonce, int n, int q, int b, int bBit) {
		
		int i = 0;
		int position = 0;
		int numberOfByte = (bBit + 1 + 7) / 8;
		int numberOfBlock = n;
		byte[] buffer = new byte[n * numberOfByte];
		
		short dualModeSampler = (short) (nonce << 8);
		
		if (q == Parameter.Q_I || q == Parameter.Q_I_P) {
		
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
					buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
		
		}
		
		if (q == Parameter.Q_III_SIZE || q == Parameter.Q_III_SPEED || q == Parameter.Q_III_P) {
			
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
					buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
			
		}
		
		while (i < n) {
			
			if (position > numberOfBlock * numberOfByte) {
				
				if (q == Parameter.Q_I || q == Parameter.Q_I_P) {
					
					numberOfBlock =
							FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
							buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
							dualModeSampler++,
							seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				if (q == Parameter.Q_III_SIZE || q == Parameter.Q_III_SPEED || q == Parameter.Q_III_P) {
					
					numberOfBlock =
							FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
							buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE,
							dualModeSampler++,
							seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				position = 0;
				
			}
			
			Y[i] = CommonFunction.load32 (buffer, position) & ((1 << (bBit + 1)) - 1);
			Y[i] -= b;
			
			if (Y[i] != (1 << bBit)) {
				
				i++;
				
			}
			
			position += numberOfByte;
			
		}
		
	}
	
	/*****************************************************************************************************************
	 * Description:	Samples A Bit from Bernoulli with Restriction of 20-Bit Exponent
	 *****************************************************************************************************************/
	private static int bernoulli (long result, long fractionOfExponent, double[][] exponentialDistribution) {
		
		/* *
		 * Computes the Actual Bernoulli Parameter = exp (-t / f)
		 * Yields A Fraction of 2^62, to Keep Only 62 Bits of Precision in This Implementation
		 * */
		double bernoulliParameter = 4611686018427387904.0;
		
		for (long i = 0, j = fractionOfExponent; i < 3; i++, j >>= 5) {
			
			bernoulliParameter *= exponentialDistribution[(int) i][(int) (j & 31)];
			
		}
		
		/* Sample from Bernoulli of bernoulliParameter */
		return (int) (((result & 0x3FFFFFFFFFFFFFFFL) - Math.round (bernoulliParameter)) >>> 63);
		
	}
	
	/*****************************************************************************************************************************************************************************
	 * Description:	Gaussian Sampler for Heuristic qTESLA Security Category-1 and Provably-Secure qTESLA Security Category-1
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n							Polynomial Degree
	 * @param		xi
	 * @param		exponentialDistribution		Exponential Distribution Table
	 * 
	 * @return		none
	 *****************************************************************************************************************************************************************************/
	public static void polynomialGaussSamplerI (long[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce, int n, double xi, double[][] exponentialDistribution) {
		
		byte[] seedExpander = new byte[n * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long randomBit;
		long bitRemained;
		long c;
		long y;
		long z;
		long buffer;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
				seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		);
		
		for (index = 0; index < n; index++) {
			
			if (j + 46 > n) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
						seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63L);
							bitRemained += 6;
						
						}
					
						r &= 0x03FFFFFFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0321020100200100L);
				
					y = 0;
				
					for (int i = 0; i < 12; i++) {
					
						c		= s - CUMULATIVE_DISTRIBUTION_TABLE_I[i][1];
						
						long b	= (((c & CUMULATIVE_DISTRIBUTION_TABLE_I[i][1]) & 1) + (CUMULATIVE_DISTRIBUTION_TABLE_I[i][1] >> 1) + (c >>> 1)) >>> 63;
						
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_I[i][0] + b);
						
						y += ~ (c >>> 63) & 1L;
					
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
						
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= xi);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (xi * y + z);
					
					buffer = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				
				} while (bernoulli (buffer, z * ((k << 1) - z), exponentialDistribution) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (k << 48) >> 48;
		
		}
		
	}
	
	/*******************************************************************************************************************************************************************************
	 * Description:	Gaussian Sampler for Heuristic qTESLA Security Category-3 (Option for Size or Speed) and Provably Secure qTESLA Security Category-3
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n							Polynomial Degree
	 * @param		xi				
	 * @param		exponentialDistribution		Exponential Distribution Table
	 * 
	 * @return		none
	 *******************************************************************************************************************************************************************************/
	public static void polynomialGaussSamplerIII (long[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce, int n, double xi, double[][] exponentialDistribution) {
		
		byte[] seedExpander = new byte[n * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long t;
		long randomBit;
		long bitRemained;
		long c;
		long y;
		long z;
		long buffer;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
				
				seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		
		);
		
		for (index = 0; index < n; index++) {
			
			if (j + 46 > n) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
						
						seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						t = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63);
							bitRemained += 6;
						
						}
					
						r &= 0x000003FFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0000032102010020L);
				
					y = 0;
				
					for (int i = 0; i < 14; i++) {
					
						c 		= t - CUMULATIVE_DISTRIBUTION_TABLE_III[i][2];
						
						long b	= ((c & CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] >> 1) + (c >> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][1] are Zero: Overflow Cannot Occur at This Point */
						c		= s - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] + b);
						
						b		= (((c & b) & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] >> 1) + (c >>> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][0] are Zero: Overflow Cannot Occur at This Point */
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][0] + b);
					
						y += ~ (c >>> 63) & 1L;
					
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
					
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= xi);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (xi * y + z);
					
					buffer = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				
				} while (bernoulli (buffer, z * ((k << 1) - z), exponentialDistribution) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (k << 48) >> 48;
		
		}
		
	}
	
	/**********************************************************************************************************************************
	 * Description:	Encoding of C' by Mapping the Output of the Hash Function H to An N-Element Vector with Entries {-1, 0, 1}
	 * 
	 * @param		postionList			{0, ..., n - 1} ^ h
	 * @param		signList			{-1, +1} ^ h
	 * @param		output				Result of the Hash Function H
	 * @param		outputOffset		Starting Point of the Result of the Hash Function H
	 * @param		n					Polynomial Degree
	 * @param		w					Number of Non-Zero Entries of Output Elements of Encryption
	 * 
	 * @return		none
	 **********************************************************************************************************************************/
	public static void encodeC (int[] positionList, short[] signList, byte[] output, int outputOffset, int n, int w) {
		
		int count = 0;
		int position;
		short domainSeparator = 0;
		short[] C = new short[n];
		byte[] randomness = new byte[FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE];
		
		/* Use the Hash Value as Key to Generate Some Randomness */
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
				randomness, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
				domainSeparator++,
				output, outputOffset, Polynomial.RANDOM
		);
		
		/* Use Rejection Sampling to Determine Positions to be Set in the New Vector */
		Arrays.fill (C, 0, n, (short) 0);
		
		/* Sample A Unique Position k times.
		 * Use Two Bytes
		 */
		for (int i = 0; i < w;) {
			
			if (count > FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE - 3) {
				
				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
						randomness, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
						domainSeparator++,
						output, outputOffset, Polynomial.RANDOM
				);
				
				count = 0;
				
			}
			
			position = (randomness[count] << 8) | (randomness[count + 1] & 0xFF);
			position &= (n - 1);
				
			/* Position is between [0, n - 1] and Has not Been Set Yet
			 * Determine Signature
			 */
			if (C[position] == 0) {
				
				if ((randomness[count + 2] & 1) == 1) {
						
					C[position] = -1;
						
				} else {
						
					C[position] = 1;
						
				}
					
				positionList[i] = position;
				signList[i] = C[position];
				i++;
					
			}
			
			count += 3;
			
		}
		
	}
	
}