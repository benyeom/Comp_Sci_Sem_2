import java.util.Scanner;
import java.util.Random;

class character {
	String role = new String("Wizard");
	int strength = 2;
	int dexterity = 3;
	int intelligence = 4;
	int constitution = 5;
	int charisma = 6;
	
	public void printCharacter() {
		System.out.print(stregth, dexterity, intelligence, constitution, charisma);
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		character one = new character();
		character.printCharacter;

		
	}
}
