package aufgabe3;

import java.time.Year;


public class ProgAppsObjC extends ProgApps{
	
	private int aktuellesJahr = Year.now().getValue(); //TODO: In class teil oder in funktion?
	private int einstellungsjahr;
	private int basisgehalt;
	
	public ProgAppsObjC(String name, int basisgehalt, int einstellungsjahr) {	
		super(name, basisgehalt, einstellungsjahr);	
		System.out.println("Konstruktor ProgAppsObjC"); //TODO REMOVE
		this.einstellungsjahr = einstellungsjahr;
		this.basisgehalt = basisgehalt;
	}

	@Override
	public int gehalt() {
		int neuesGehalt;
		int dienstjahrejahre = aktuellesJahr - einstellungsjahr;
		int zins = 2;
		

		if (einstellungsjahr >= aktuellesJahr) { //Falls das Einstellungsjahr im aktuellen Jahr oder in der Zukunft wird das Basisgehalt zurückgegeben.
			neuesGehalt = basisgehalt;
		} else {
			neuesGehalt = (int) Math.round(basisgehalt * Math.pow((1.0 + zins/100.0),dienstjahrejahre)); //Berechne Zinsen inkl Zinseszinsen, runde auf Int.
		}	
		return neuesGehalt;
	}
}
