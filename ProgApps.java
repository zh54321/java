package aufgabe3;

public abstract class ProgApps extends Programmierer{

	public ProgApps(String name, int basisgehalt, int einstellungsjahr) {
		super(name, basisgehalt, einstellungsjahr); // Konstruktor der Oberklasse aufrufen.
		System.out.println("Konstruktor ProgApps"); //TODO REMOVE
	}	

	public ProgApps(ProgApps original) {
		System.out.println("CopyKonstruktor ProgAppsJava"); //TODO REMOVE
		super(original.name, original.basisgehalt, original.einstellungsjahr);

	}

}
