

import java.util.Arrays;

public class pre {
	
	public static void main(String args[]){
		int bb=1,cb=8,ab=6,db=4;
		int bt=7,ct=8,at=10,dt=15;
		join j=new join();
	String account_ny[][]={
			  {"116171599","bank_lin","56697"  },
			  {"132303888","bank_wa","65438"  },
			  {"164666188","bank_ny","62216"  },
			  {"190710105","bank_bos","56762"  },
			  {"197616018","bank_wa","67622"  },
			  {"227657699","bank_ny","74779"  },
			  {"235878310","bank_san","72692"  },
			  {"237490166","bank_wa","66085"  },
			  {"267811377","bank_wa","62592"  },
			  {"269606783","bank_ny","66613"  },
			  {"315280435","bank_wa","65446"  },
			  {"333140780","bank_ny","50804"  },
			  {"380311310","bank_san","56156"  },
			  {"383011560","bank_hou","59450"  },
			  {"395799032","bank_ny","59531"  },
			  {"432081046","bank_oma","53856"  },
			  {"445553058","bank_hou","57295"  },
			  {"490751326","bank_lin","52817"  },
			  {"494782113","bank_bos","61646"  },
			  {"508159529","bank_oma","50638"  },
			  {"547260577","bank_lin","64217"  },
			  {"553811003","bank_oma","59100"  },
			  {"570145752","bank_ny","55365"  },
			  {"583703328","bank_san","60377"  },
			  {"585046895","bank_san","60892"  },
			  {"589873390","bank_ny","53071"  },
			  {"590381052","bank_hou","54711"  },
			  {"632349919","bank_hou","73515"  },
			  {"638979850","bank_oma","65676"  },
			  {"643288723","bank_san","73816"  },
			  {"703592215","bank_ny","57435"  },
			  {"708280784","bank_san","56234"  },
			  {"714843561","bank_hou","59539"  },
			  {"716444105","bank_san","73943"  },
			  {"736995077","bank_lin","62238"  },
			  {"739583429","bank_wa","53182"  },
			  {"790181753","bank_oma","56693"  },
			  {"823219316","bank_lin","67539"  },
			  {"839291883","bank_lin","67804"  },
			  {"856419521","bank_lin","54337"  },
			  {"872792211","bank_wa","56378"  },
			  {"875651869","bank_san","55903"  },
			  {"877022935","bank_ny","68530"  },
			  {"877291400","bank_san","68928"  },
			  {"916418171","bank_hou","73848"  },
			  {"916588700","bank_ny","71422"  },
			  {"917013248","bank_ny","61652"  },
			  {"935348399","bank_oma","53479"  },
			  {"947833181","bank_oma","63099"  },
			  {"949700884","bank_ny","50781"  },
			  {"979228874","bank_san","51978"  },
			  {"980905039","bank_oma","54617"  },
			  {"990719090","bank_oma","54621"  },
			  {"997773734","bank_oma","55643"  }
			};
	String branch[][]={
			  {"bank_bos","Boston","118408"  },
			  {"bank_hou","Houston","378358"  },
			  {"bank_lin","Lincoln","425649"  },
			  {"bank_oma","Omaha","567422"  },
			  {"bank_san","San Francisco","630919"  },
			  {"bank_wa","Washington","436743"  }
			};
	String customers_hou[][]={
			  {"Akiko Jepson","180 Hazy Shadow","New York"  },
			  {"Alishia Sergi","2742 Distribution Way","New York"  },
			  {"Andy Thompson","861 Sleepy Expressway","San Francisco"  },
			  {"Angle Kok","267 Silent Oak Knoll","Boston"  },
			  {"Annalisa Bowers","784 Green Third Trace","Boston"  },
			  {"Aurore Turnbull","888 High Crescent","Lincoln"  },
			  {"Barney Bond","576 Neck Avenue","Omaha"  },
			  {"Bill Zielschot","532 Golden Well Quay","Houston"  },
			  {"Brock Bolognia","4486 W O St #1","New York"  },
			  {"Buford Berg","378 Loaf Shore","Omaha"  },
			  {"Chester Lutz","868 Broad Horse Lawn","Washington"  },
			  {"Chung Snider","842 Crystal Dell","San Francisco"  },
			  {"Colette Kardas","21575 S Apple Creek Rd","Omaha"  },
			  {"Cyril Daufeldt","3 Lawton St","New York"  },
			  {"Danita Boonzayer","110 Tawny Ninth Crest","Omaha"  },
			  {"Dorsey Stewart","3 Little Union","Washington"  },
			  {"Elton Cole","P.O. Box 22346 San","Francisco"  },
			  {"Elvira Wilkerson","5 Hidden Vista","Houston"  },
			  {"Emerson Jongens","159 Fallen Court","Washington"  },
			  {"Fausto Agramonte","5 Harrison Rd","New York"  },
			  {"Frankie Soestdijck","458 Quaking Mews","Washington"  },
			  {"Georgianne Hansen","925 Middle Radial","Houston"  },
			  {"Haydee Denooyer","25346 New Rd","New York"  },
			  {"Hermine Lyons","P.O. Box 56919","Omaha"  },
			  {"Jame Sargent","310 Branch Ridge","Houston"  },
			  {"Jeanie Franklin","732 Second Highway","Omaha"  },
			  {"Jennell Crane","122 Bluff Turnpike","Omaha"  },
			  {"Jess Chaffins","18 3rd Ave","New York"  },
			  {"Jina Briddick","38938 Park Blvd","Boston"  },
			  {"Jolanda Knegjens","440 Broad Gate","Boston"  },
			  {"Jose Stockham","128 Bransten Rd","New York"  },
			  {"Joseph Dillard","411 Dewy Squaw Isle","San Francisco"  },
			  {"Justine Mugnolo","38062 E Main St","New York"  },
			  {"Kallie Blackwood","701 S Harrison Rd","San Francisco"  },
			  {"Kenny Davies","496 Perkins Swale","Houston"  },
			  {"Kenyetta Doyle","217 Quiet Willow Beach","Lincoln"  },
			  {"Kristofer Broadbent","471 Sleepy Treasure Vista","Omaha"  },
			  {"Lacy Leenderts","285 S Row","Boston"  },
			  {"Lajuana Jensen","P.O. Box 52795","Lincoln"  },
			  {"Lance Mathis","548 Grove Gateway","Washington"  },
			  {"Lanell Colpa","P.O. Box 12114","Washington"  },
			  {"Lawrence Orsoy","874 Sixth Inlet","Omaha"  },
			  {"Layla Springe","229 N Forty Driv","New York"  },
			  {"Lenny Wu","586 Burning Barn Bend","Lincoln"  },
			  {"Lenny van","Haren P.O. Box 79376","Lincoln"  },
			  {"Lura Fisher","481 Wishing Rose","Boston"  },
			  {"Marylin Mccarthy","82 Wishing Beach","San Francisco"  },
			  {"Mirta Mallett","7 S San Marcos Rd","New York"  },
			  {"Napoleon Boeff","204 Spur Gardens","Boston"  },
			  {"Oretha Menter","8 County Center Dr #647","Boston"  },
			  {"Ozell Shealy","8 Industry Ln","New York"  },
			  {"Roger Hasselman","965 Hazy Well","Lincoln"  },
			  {"Ryan Jackson","P.O. Box 94764","Washington"  },
			  {"Sophia Sloan","505 Pleasant Cider","Omaha"  },
			  {"Stephaine Vinning","3717 Hamann Industrial Pky","San Francisco"  },
			  {"Tarra Nachor","39 Moccasin Dr","San Francisco"  },
			  {"Tawna Buvens","3305 Nabell Ave #679","New York"  },
			  {"Tijuana Barnes","624 Noble Lagoon","Lincoln"  },
			  {"Trinidad Mcrae","10276 Brooks St","San Francisco"  },
			  {"Vernia Anthony","187 Blue Island Place","Houston"  }
			};
	String depositor_ny[][]={
			  {"Akiko","585046895"  },
			  {"Alishia Sergi","949700884"  },
			  {"Andy Thompson","716444105"  },
			  {"Aurore Turnbull","736995077"  },
			  {"Barney Bond","980905039"  },
			  {"Bill Zielschot","714843561"  },
			  {"Brock Bolognia","333140780"  },
			  {"Buford Berg","638979850"  },
			  {"Chester Lutz","132303888"  },
			  {"Chung Snider","708280784"  },
			  {"Colette Kardas","990719090"  },
			  {"Cyril Daufeldt","916588700"  },
			  {"Danita Boonzayer","935348399"  },
			  {"Dorsey Stewart","739583429"  },
			  {"Elton Cole","877291400"  },
			  {"Elvira Wilkerson","632349919"  },
			  {"Emerson Jongens","872792211"  },
			  {"Fausto Agramonte","570145752"  },
			  {"Frankie van","197616018"  },
			  {"Georgianne Hansen","445553058"  },
			  {"Haydee Denooyer","227657699"  },
			  {"Hermine Lyons","947833181"  },
			  {"Jame Sargent","590381052"  },
			  {"Jeanie Franklin","790181753"  },
			  {"Jennell Crane","997773734"  },
			  {"Jess Chaffins","589873390"  },
			  {"Jina Briddick","190710105"  },
			  {"Jose Stockham","395799032"  },
			  {"Joseph Dillard","875651869"  },
			  {"Justine Mugnolo","269606783"  },
			  {"Kallie Blackwood","583703328"  },
			  {"Kenny Davies","916418171"  },
			  {"Kenyetta Doyle","547260577"  },
			  {"Kristofer Broadbent","432081046"  },
			  {"Lajuana Jensen","823219316"  },
			  {"Lance Mathis","315280435"  },
			  {"Lanell Colpa","237490166"  },
			  {"Lawrence Orsoy","508159529"  },
			  {"Layla Springe","703592215"  },
			  {"Lenny Wu","490751326"  },
			  {"Lenny van","839291883"  },
			  {"Marylin Mccarthy","979228874"  },
			  {"Mirta Mallett","164666188"  },
			  {"Oretha Menter","494782113"  },
			  {"Ozell Shealy","877022935"  },
			  {"Roger Hasselman","116171599"  },
			  {"Ryan Jackson","267811377"  },
			  {"Sophia Sloan","553811003"  },
			  {"Stephaine Vinning","235878310"  },
			  {"Tarra Nachor","380311310"  },
			  {"Tawna Buvens","917013248"  },
			  {"Tijuana Barnes","856419521"  },
			  {"Trinidad Mcrae","643288723"  },
			  {"Vernia Anthony","383011560"  }
			};
	String depositor_oma[][]={
			  {"Barney Bond","980905039"  },
			  {"Buford Berg","638979850"  },
			  {"Colette Kardas","990719090"  },
			  {"Danita Boonzayer","935348399"  },
			  {"Hermine Lyons","947833181"  },
			  {"Jeanie Franklin","790181753"  },
			  {"Jennell Crane","997773734"  },
			  {"Kristofer Broadbent","432081046"  },
			  {"Sophia Sloan","553811003"  }
			};
	String account_oma[][]={
			  {"432081046","bank_oma","53856"  },
			  {"508159529","bank_oma","50638"  },
			  {"553811003","bank_oma","59100"  },
			  {"638979850","bank_oma","65676"  },
			  {"790181753","bank_oma","56693"  },
			  {"935348399","bank_oma","53479"  },
			  {"947833181","bank_oma","63099"  },
			  {"980905039","bank_oma","54617"  },
			  {"997773734","bank_oma","55643"  }
			};
	String account_san[][]={
			  {"235878310","bank_san","72692"  },
			  {"380311310","bank_san","56156"  },
			  {"583703328","bank_san","60377"  },
			  {"585046895","bank_san","60892"  },
			  {"643288723","bank_san","73816"  },
			  {"716444105","bank_san","73943"  },
			  {"875651869","bank_san","55903"  },
			  {"877291400","bank_san","68928"  },
			  {"979228874","bank_san","51978"  }
			};
	
	//		j.merge(customers_hou, depositor_oma, 0, 0, ct, dt,customers_hou.length,depositor_oma.length);
	comparator cp=new comparator();
	String[][] result=cp.compare(customers_hou,2);
	}
}
