import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman peter = new Spiderman();
		peter.fight();
		peter.printArt();
		
		Spiderman[] multiverse = new Spiderman[50];
		
		for (int i = 0; i < multiverse.length; i++) {
			multiverse[i] = new Spiderman();
		}

		for (int i = 0; i < multiverse.length; i++) {
			multiverse[i].setActor("Tom Holland");
			multiverse[i].setAge(24);
			multiverse[i].setVillain("The Vulture");
		}
		
		for (int i = 0; i < multiverse.length; i++) {
			System.out.print(multiverse[i].getActor())
		}
		
		
	}
}
