package aufgabe3;

import tmp.Entwickler;

public class vererbung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmierer person1 = new ProgAppsJava("Hans", 100, 2020);
		System.out.println(person1.gehalt());

		Programmierer person2 = new ProgAppsObjC("Hans2", 100, 2020);
		System.out.println(person2.gehalt());
		
		Programmierer person3 = new ProgDesktopCs("Martin", 10000, 2020, 0); //ohne zuschlag? Fehlerprüfung!
		System.out.println(person3.getName());
		System.out.println(person3.gehalt());
		System.out.println(person3.getPnr());
		
		((ProgDesktop) person3).setZuschlag(1000);
		System.out.println(((ProgDesktop) person3).getZuschlag());
		
		
		ProgDesktop c = (ProgDesktopCs)person3; //muss dies in eine funktion integriert werden?
		c.setZuschlag(200); //Downcasting?
		System.out.println(c.getZuschlag());
		System.out.println(c.getName());
		System.out.println(c.getPnr());
		
		
		

		

	}

}
