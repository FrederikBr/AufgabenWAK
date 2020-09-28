package aufgabenzettel2;

import Prog1Tools.IOTools;

/**
 * Das Programm implementiert auf drei weisen den angegeben ALgorithmus: lies
 * 
 * den Wert von n ein, setze ihn auf 3, solange i < 2n wiederhole a) erhöhre i
 * und 1 und gib aus 1/(2i+1)
 * 
 * 1. while- Schleife 2. for- Schleife 3. Do- While Schleife
 * 
 * Diese sind jeweils in drei Methoden wiederzufinden.
 * 
 * @author frederik
 *
 */
public class Aufgabe1 {

	private static int I = 3;

	public static void main(String[] args) {

		double n = IOTools.readInt("Gebe einen Wert für n ein: ");

		WhileSchleife(n);

		ForSchleife(n);

		DoWhileSchleife(n);
		// TODO Auto-generated method stub

	}

	/**
	 * Implementierung des Alg. in der Form einer While SChleife.
	 * 
	 * @param n übergeben aus der Main Methode
	 */
	public static void WhileSchleife(double n) {

		while (I < 2 * n) {
			I++;
		}

		System.out.println(1.0 / (2 * I + 1));

	}

	/**
	 * Implementierung des Alg. in der Form einer For SChleife.
	 */
	public static void ForSchleife(double n) {
		for (I = 3; I < 2 * n; I++) {
		}
		System.out.println(1.0 / (2.0 * I + 1));

	}

	/**
	 * Implementierung des Alg. in der Form einer DoWhile SChleife.
	 */
	public static void DoWhileSchleife(double n) {
		
		do {
			I++;
		} while (I < 2 * n);

		System.out.println(1.0/(2.0*I+1));
	}

}
