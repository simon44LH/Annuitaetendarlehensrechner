package main;

public class Darlehen {
	
	public static void main(String[] args) {
		DarlehenRechner.Rechnung(300000, 30, 3.5);
	}

	//Die Summe die zu anfang aufgenommen wird. = Kreditvolumen
	double darlehenssumme;
		
	//Laufzeit des Darlehens also die Jahre des Kredits
	int laufzeit;
	
	//Zinsrate die für den Kredit anfällt.
	double zinsen;
	
	//Die Summe in Euro die in einem Jahr an Zinsen anfallen.
	double zinsrate;
	
	//Die Höhe der Tilgung in Prozent die für den Kredit am Beginn vereinbart wird. 
	double tilgung;
	
	//Die Summe in Euro die in einem Jahr an Tilgung anfällt. 
	double tilgungsrate;
	
	//Die jährliche Rate die anfällt in Euro (zinsrate + tilgung) 
	double rate;
	
	//Die Rate die jährlich anfällt in Prozent. (Zinsrate + Tilung) 
	double rateProznet;
	
	
}
