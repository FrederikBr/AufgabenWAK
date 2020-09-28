package aufgabenzettel1;

import Prog1Tools.IOTools;

/**
 * Dieses Programm zeigt dem Nutzer an, ob es sich um ein Schaltjahr handelt
 * oder nicht. Ein Jahr ist kein Schaltjahr, wenn die Jahreszahl nicht durch 4
 * teilbar ist. Ein Jahr ist ein Schaltjahr, wenn die Zahl durch 4, nicht aber
 * durch 100 teilbar ist. Ein Jahrist ein Schaltjahr wenn durch 4, durch 100 und
 * durch 400 teilbar ist.
 * 
 * @author frederik
 *
 */
public class Aufgabe6 {

	public static void main(String[] args) {

		int jahr = IOTools.readInt("Geben Sie hier das gewünschte Jahr ein: ");

		boolean schaltjahr = true;

		if (jahr % 400 == 0 && jahr % 100 == 0 || jahr % 4 == 0 && jahr % 100 != 0) {
			System.out.println("Ist ein Schaltjahr");

		} else {
			schaltjahr = false;
			System.out.println("Kein Schaltjahr");
		}

	}

}

// TODO Auto-generated method stub
