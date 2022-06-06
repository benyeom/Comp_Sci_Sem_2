import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Performer {
	String name;
	int age;
	
	public Performer() {
		name = "Doja Cat";
		age = 26;
	}
	
	public Performer(String a, int b) {
		name = a;
		age = b;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setAge(int b) {
		age = b;
	}
	
	public String getName() {
		return name;
	}
	
	public void practice() {
		System.out.println(name + " is practicing!");
	}
	
	public void perform() {
		System.out.println(name + " is performing!");
	}
}

class Musician extends Performer {
	String instrument;
	
	public Musician() {
		instrument = "Cello";
	}
	
	public Musician(String a) {
		instrument = a;
	}
	
	public void setInstrument(String a) {
		instrument = a;
	}
	
	public String getInstrument() {
		return instrument;
	}
	
	public void playInstrument() {
		System.out.println(name + " is playing the " + instrument);
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer performer1 = new Performer();
		Performer performer2 = new Performer("Ben", 18);
		
		Musician musician1 = new Musician();
		Musician musician2 = new Musician("Clarinet");
		
		System.out.println(performer1.getName());
		performer1.practice();
		
		System.out.println(performer2.getName());
		performer2.practice();
		
		System.out.println(musician1.getName());
		musician1.perform();
		musician1.playInstrument();
		
		musician2.practice();
		System.out.println(musician2.getInstrument());
		
	}
}
