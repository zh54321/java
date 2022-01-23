package aufgabe3;

public abstract class Programmierer {
	private String pnr;
	private String name;
	private int basisgehalt;
	private int einstellungsjahr;
	
	public Programmierer(String name, int basisgehalt, int einstellungsjahr) {	
		this.name = name;
		this.basisgehalt = basisgehalt;
		this.einstellungsjahr = einstellungsjahr;
		this.pnr = null;
		System.out.println("Konstruktor Programmierer");
	}	
	
	public Programmierer(Programmierer original) {	//Kopierkonstruktur
		this.name = original.name;
		this.basisgehalt = original.basisgehalt;
		this.einstellungsjahr = original.einstellungsjahr;
		this.pnr = null;
		System.out.println("Copy Konstruktor Programmierer");
	}
	
	public abstract int gehalt(); //Abstrakte Klass implementierung erfolgt in den untergeordnen Klassen.
	
	public String getName() { //Getter-Methode f�r Name
		return name;	
	}
	public String getPnr() { //Gette-Methode f�r Pnr
		return pnr;	
	}
	public int getBasisgehalt() { //Getter-Methode f�r Basisgehalt	
		return basisgehalt;	
	}
	public int getEinstellungsjahr() { //Getter-Methode f�r Einstellungsjahr
		return einstellungsjahr;	
	}

	public void setPnr(String pnr) { //Setter-Methode f�r den Pnr
		this.pnr = pnr;
	}
	
	public void setName(String name) { //Setter-Methode f�r den Namen
		this.name = name;
	}
	
	//public void setBasisgehalt(String basisgehalt) {}: Die Setter-Methode f�r das Basisgehalt ist nicht Sinvoll, da dies statisch ist und nicht angepasst werden sollte.

	//public void setEinstellungsjahr(String einstellungsjahr) { }  Die Setter-Methode ist fpr das Einstellungsjahr nicht sinvoll ist, da sich diese grunds�tzlich nicht �ndert.

}
