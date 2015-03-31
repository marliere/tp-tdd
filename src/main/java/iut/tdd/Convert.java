package iut.tdd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Convert {

	static Map<String, String> carte = new HashMap<String, String>();
	
	public static String num2text(String input) {
		String res = "";
		
		//ajouts des valeurs dans la map
		carte.put("0", "zero");
		carte.put("1", "un");
		carte.put("2", "deux");
		carte.put("3", "trois");
		carte.put("4", "quatre");
		carte.put("5", "cinq");
		carte.put("6", "six");
		carte.put("7", "sept");
		carte.put("8", "huit");
		carte.put("9", "neuf");
		carte.put("10", "dix");
		carte.put("11", "onze");
		carte.put("12", "douze");
		carte.put("13", "treize");
		carte.put("14", "quatorze");
		carte.put("15", "quinze");
		carte.put("16", "seize");
		carte.put("20", "vingt");
		carte.put("30", "trente");
		carte.put("40", "quarante");
		carte.put("50", "cinquante");
		carte.put("60", "soixante");
		
		
		for (String mapKey : carte.keySet()) {
			if (input.equals(mapKey))
				res = carte.get(mapKey);
		}
		
		if(input.length() == 2 && res == ""){
			for (int i = 1; i < 10; i++) {
				if(input.charAt(0) == '1' && Integer.parseInt(input.substring(1, 2)) > 6){
					res = carte.get("10") + " " + carte.get(input.substring(1, 2));
				}
				if(Integer.parseInt(input.substring(0,1)) == i){
					res = carte.get(i + "0") + " " + carte.get(input.substring(1, 2));
				}
			}
		}
		
		return res;
	}
	public static String text2num(String input) {
		return null;
	}
}