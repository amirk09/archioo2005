package calculatrice;

public enum MonEnumException {
	UTILISATION_DU_ZERO(1,"Utilisation d'un zero"),  
	UTILISATION_DE_UN(2,"Utilisation de un"),
	MAUVAIS_OPERATOR(3,"veuillez rentrez un operateur connu"),
	UKNOWN_KEY(4,"ajouter une clé connu");
	
	private final int code;
	private final String defaultMessage;
	
	MonEnumException(int code, String defaultMessage){
		this.code=code;
		this.defaultMessage=defaultMessage;
	}
	public int getCode( ) {
		return code;
	}
	
	public String getDefaultMessage() {
		return defaultMessage;
	}
	
	public static String getNameFromCode(int code) {
		for(MonEnumException e : MonEnumException.values()) {
			if(code == e.code)
				return e.name();
		}
		return null;
	}
}
