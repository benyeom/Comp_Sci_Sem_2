import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Rogue {
	String name;
	int health;
	int attack;
	
	Random rand = new Rand(System.in);
	
	public Rogue() {
		name = "";
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1;
	}
	
	public Rogue() {
		name = "Ben";
		health = 0;
		attack = 0;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard wizard = new Wizard();
		Warrior warrior = new Warrior();
		Rogue rogue = new Rogue();
		


		
	}
}
