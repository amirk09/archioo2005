package calculatrice;

import java.util.Map;

public class Langue {
	private static Map<String, String> HashMap = new java.util.HashMap<>();
	
	
	private static Map initFR() {
		HashMap = new HashMap<>();
		HashMap.put("valeur1", "Entrez a: ");
	}
	public static String getmot(String key) throws MonException {
		if (HashMap.containsKey(key)==false)
			throw new MonException(MonEnumException.UKNOWN_KEY.getCode(),MonEnumException.UKNOWN_KEY.getDefaultMessage());
	
	return HashMap.get(key);
	}
	public static Map init (String key) {
		if (key.contains("FR")) {
			return initFR();
		}
		else {
			return initEN();
		}
	}
}
