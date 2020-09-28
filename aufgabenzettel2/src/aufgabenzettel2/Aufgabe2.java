package aufgabenzettel2;

import Prog1Tools.IOTools;

/**
 * Dieses Programm liest drei Zahlen ein und gibt den mittleren davon aus
 * Die Zahlen sollen der Größe nach geordnet werden und die mittlere Zahl soll ausgegeben werden.
 * @author frederik
 *
 */
public class Aufgabe2 {

	public static void main(String[] args) {
		
		int a = IOTools.readInt("Zahl 1: ");
		int b = IOTools.readInt("Zahl 2: ");
		int c = IOTools.readInt("Zahl 3: ");

		if (a > b) {
			int mom = a;
			b = a; 
			b = mom; 
		}
		
		if (b > c) {
			int mom = b;
			b = c; 
			
		}
	}
	
	
	
	

}
