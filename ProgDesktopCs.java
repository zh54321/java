package aufgabe3;

import java.time.Year;

public class ProgDesktopCs extends ProgDesktop{
	private int aktuellesJahr = Year.now().getValue(); //TODO: In class teil oder in funktion?
	private int einstellungsjahr;
	private int basisgehalt;
	private int zuschlag;
	
	public ProgDesktopCs(String name, int basisgehalt, int einstellungsjahr, int zuschlag) {	
		super(name, basisgehalt, einstellungsjahr, zuschlag);
		System.out.println("Konstruktor ProgDesktopCs"); //TODO REMOVE
		this.einstellungsjahr = einstellungsjahr;
		this.basisgehalt = basisgehalt;
		this.zuschlag = zuschlag;
	}

	@Override
	public int gehalt() {
		int neuesGehalt;
		int dienstjahrejahre = aktuellesJahr - einstellungsjahr;
		int jaehrlicherZuschlag = 100;

		if (einstellungsjahr >= aktuellesJahr) { //Falls das Einstellungsjahr im aktuellen Jahr oder in der Zukunft wird das Basisgehalt zurückgegeben.
			neuesGehalt = basisgehalt + zuschlag;
		} else {
			neuesGehalt = basisgehalt + zuschlag + (dienstjahrejahre * jaehrlicherZuschlag); //berechne neues gehalt
		}	
		return neuesGehalt;
	}

}
