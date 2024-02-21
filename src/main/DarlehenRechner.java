package main;

import java.util.Locale;

public class DarlehenRechner {

	public static void Rechnung(double darlehenssumme, int laufzeit, double zinsen) {
		double monatlich;
		double gezahlteZinsen = 0;
		double zinsrate;
		double tilgungsrate;
		int jahr = 1;
		double getilgt = 0;
		double jaehrlich;


		// Berechnung der Jährlichen Rate nach der Annuitätenmethode
		jaehrlich = darlehenssumme * (zinsen / 100 / (1 - Math.pow(1 + zinsen / 100, -laufzeit)));

		monatlich = jaehrlich / 12;

		System.out.println(String.format(Locale.GERMANY,
				"Darlehenssumme: %,.2f €\nLaufzeit: %d Jahre\nZinsen: %.2f%%\nJährlich: %,.2f €\nMonatlich: %,.2f €",
				darlehenssumme, laufzeit, zinsen, jaehrlich, monatlich));
		System.out.println("---------------------------------");

		while (darlehenssumme > 0 && jahr <= laufzeit) {
			// Berechnung der Zinsen für das aktuelle Jahr basierend auf dem aktuellen
			// Restbetrag
			zinsrate = darlehenssumme * zinsen /100;
			gezahlteZinsen += zinsrate;

			// Die reguläre Tilgungsrate basiert auf der jährlichen Rate abzüglich der
			// Zinsen
			tilgungsrate = jaehrlich - zinsrate;
			getilgt += tilgungsrate;

			System.out.println(String.format(Locale.GERMANY,
					"%2d. Jahr  Restbetrag: %,.2f €  Zinsbetrag: %,.2f €  Tilgung: %,.2f € Gesamt: %,.2f €", jahr,
					darlehenssumme, zinsrate, tilgungsrate, monatlich * 12));
			
			// Aktualisiere den Restbetrag des Darlehens
			darlehenssumme -= tilgungsrate;

			jahr++;
		}
		System.out.println("---------------------------------");
		System.out.println(String.format(Locale.GERMANY, "Gezahlte Zinsen über die Laufzeit: %,.2f € Getilgt: %,.2f", gezahlteZinsen, getilgt));
	}

}
