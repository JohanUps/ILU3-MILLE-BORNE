package cartes;

public enum Type {
	FEU("feu vert", "feu rouge ", "véhicule prioritaire"),
	ESSENCE("essence", "panne d'essence", "citerne d'essence"),
	CREVAISON("roue de secours", "crevaison", "increvable"),
	ACCIDENT("réparations", "accident", "as du volant");
	
	private final String parade;
	private final String attaque;
	private final String botte;
	
	Type(String parade, String attaque, String botte){
		this.parade = parade;
		this.attaque = attaque;
		this.botte = botte;
	}

	public String getParade() {
		return parade;
	}

	public String getAttaque() {
		return attaque;
	}

	public String getBotte() {
		return botte;
	}
	

}
