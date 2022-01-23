package aufgabe3;

public abstract class ProgDesktop extends Programmierer{
	private int zuschlag = 0;
	
	public ProgDesktop(String name, int basisgehalt, int einstellungsjahr, int zuschlag) {	
		super(name, basisgehalt, einstellungsjahr);	
		System.out.println("Konstruktor ProgDesktop"); //TODO REMOVE
	}

	public int getZuschlag() {		
		return zuschlag;
	}
	
	public void setZuschlag(int zuschlag) {
		this.zuschlag = zuschlag;
	}
}
