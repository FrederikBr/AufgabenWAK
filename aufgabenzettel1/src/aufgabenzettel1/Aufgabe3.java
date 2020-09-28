package aufgabenzettel1;

import Prog1Tools.IOTools;

/**
 * Dieses Programm fragt nach drei Zahlen und gibt dann die Summe, den
 * Mittelwert das Produkt aus.
 * 
 * @author frederik
 *
 */

public class Aufgabe3 {

	public static void main(String[] args) {

		double n = IOTools.readInt("Zahl 1: ");
		double m = IOTools.readInt("Zahl 2: ");
		double o = IOTools.readInt("Zahl 3: ");

		Sum(m, n, o);
		Mittelwert(m, n, o);
		Produkt(m, n, o);

		// TODO Auto-generated method stub

	}

	public static void Sum(double n, double m, double o) {

		System.out.println(m + n + o);

	}

	public static void Mittelwert(double n, double m, double o) {

		double sum = n + m + o;

		System.out.println(sum / 3);
	}

	public static void Produkt(double n, double m, double o) {
		System.out.println(m * n * o);
	}
}
