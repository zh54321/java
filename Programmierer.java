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
	
	public String getName() { //Getter-Methode für Name
		return name;	
	}
	public String getPnr() { //Gette-Methode für Pnr
		return pnr;	
	}
	public int getBasisgehalt() { //Getter-Methode für Basisgehalt	
		return basisgehalt;	
	}
	public int getEinstellungsjahr() { //Getter-Methode für Einstellungsjahr
		return einstellungsjahr;	
	}

	public void setPnr(String pnr) { //Setter-Methode für den Pnr
		this.pnr = pnr;
	}
	
	public void setName(String name) { //Setter-Methode für den Namen
		this.name = name;
	}
	
	//public void setBasisgehalt(String basisgehalt) {}: Die Setter-Methode für das Basisgehalt ist nicht Sinvoll, da dies statisch ist und nicht angepasst werden sollte.

	//public void setEinstellungsjahr(String einstellungsjahr) { }  Die Setter-Methode ist fpr das Einstellungsjahr nicht sinvoll ist, da sich diese grundsätzlich nicht ändert.

}
