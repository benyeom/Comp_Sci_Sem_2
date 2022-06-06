import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);	
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter one = new myCharacter();


		
	}
}
