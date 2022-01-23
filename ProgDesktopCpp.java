package aufgabe3;

public class ProgDesktopCpp extends ProgDesktop{
	private int basisgehalt;
	private int zuschlag;
	
	public ProgDesktopCpp(String name, int basisgehalt, int einstellungsjahr, int zuschlag) {	
		super(name, basisgehalt, einstellungsjahr,zuschlag);
		this.basisgehalt = basisgehalt;
		this.zuschlag = zuschlag;
	}

	@Override
	public int gehalt() {
		int neuesGehalt;
		
		neuesGehalt = basisgehalt + zuschlag;
		
		return neuesGehalt;
	}
	
}
