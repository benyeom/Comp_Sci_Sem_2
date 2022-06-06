import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();

		Ascii one = new Ascii("Cactus");
		Ascii two = new Ascii("Human", "Ben");
		Ascii three = new Ascii("Dog", 4);
		// Ascii four = new Ascii("Other", "Stick", 3);
		Ascii five = new Ascii("Donut", "Food", 2);
		one.printArt();
		two.printArt();
		three.printArt();
		// four.printArt();
		five.printArt();

		
	}
}
