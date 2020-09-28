package aufgabenzettel1;

import Prog1Tools.IOTools;

public class aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperatur = IOTools.readInt("Temperatur: ");

//		(32 °F − 32) × 5/9 = 0 °C

		double fahrenheit = (temperatur * 9 / 5) + 32;

		System.out.println(fahrenheit);
	}

}
