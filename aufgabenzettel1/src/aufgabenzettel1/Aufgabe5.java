package aufgabenzettel1;

/**
 * Ganze Zahl n = 78636 und jede ziffer von n ausgeben.
 * 
 * @author frederik
 *
 */

public class Aufgabe5 {

	public static int ZAHL = 78636;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZahlZerteilen();
	}

	public static void ZahlZerteilen() {

		int einer = ZAHL % 10; // 78636 % 10 = 6

		int n = ZAHL / 10; // 78636 / 10 = 7863,6

		int zehner = n % 10; // 78636 % 10 = 3

		int m = n / 10; // 7863,6 / 10 = 786,6

		int hunderter = m % 10;

		int o = m / 10;

		int tausender = o % 10;

		int p = o / 10;

		int zehntausender = p % 10;

		System.out.println(ZAHL);
		System.out.println(zehntausender);
		System.out.println(tausender);
		System.out.println(hunderter);
		System.out.println(zehner);
		System.out.println(einer);

	}

}
