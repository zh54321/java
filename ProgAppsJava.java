package aufgabe3;

import java.time.Year;

public class ProgAppsJava extends ProgApps{

	private int aktuellesJahr = Year.now().getValue(); //TODO: In class teil oder in funktion?
	private int einstellungsjahr;
	private int basisgehalt;

	
	public ProgAppsJava(String name, int basisgehalt, int einstellungsjahr) {	
		super(name, basisgehalt, einstellungsjahr); // Konstruktor der Oberklasse aufrufen.
		System.out.println("Konstruktor ProgAppsJava"); //TODO REMOVE
		this.einstellungsjahr = einstellungsjahr;
		this.basisgehalt = basisgehalt;
	}
	
	public ProgAppsJava(ProgAppsJava progAppsJava) {
		System.out.println("CopyKonstruktor ProgAppsJava"); //TODO REMOVE
		super(name, basisgehalt, einstellungsjahr);
		this.einstellungsjahr = progAppsJava.einstellungsjahr;
		this.basisgehalt = progAppsJava.basisgehalt;
	}
		
	@Override
	public int gehalt() {

		int neuesGehalt;
		int dienstjahrejahre = aktuellesJahr - einstellungsjahr;
		int zins = 3;
		

		if (einstellungsjahr >= aktuellesJahr) { //Falls das Einstellungsjahr im aktuellen Jahr oder in der Zukunft wird das Basisgehalt zurückgegeben.
			neuesGehalt = basisgehalt;
		} else {
			neuesGehalt = (int) Math.round(basisgehalt * Math.pow((1.0 + zins/100.0),dienstjahrejahre)); //Berechne Zinsen inkl Zinseszinsen, runde auf Int.
		}	
		return neuesGehalt;
	}
}
