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
	
	public Performer(String a) {
		name = a;
		age = 20;
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

class Actor extends Performer {
	String type;
	
	public Actor() {
		type = "theater";
	}
	
	public Actor(String name, String t) {
		super(name);
		type = t;
	}
	
	public void practice() {
		System.out.println(super.getName() + " is REALLY practicing!");
	}
	
	public void perform() {
		System.out.println(super.getName() + " is REALLY performing!");
	}
	
	public void monologue() {
		System.out.println(name + " said that he is going to faint!");
	}
}

class Musician extends Performer {
	String instrument;
	
	public Musician(String name, String a) {
		super(name);
		instrument = a;
	}
	
	public Musician(String name, int age, String a) {
		super(name, age);
		instrument = a;
	}
	
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

class Apprentice extends Musician {
	String school;
	int yearsOfExperience;
	
	public Apprentice() {
		school = "CVHS";
		yearsOfExperience = 0;
	}
	
	public Apprentice(String s, int y) {
		school = s;
		yearsOfExperience = y;
	}
	
	public Apprentice(String instrument, String s, int y) {
		super(instrument);
		school = s;
		yearsOfExperience = y;
	}
	
	public Apprentice(String name, int age, String instrument, String s, int y) {
		super(name, age, instrument);
		school = s;
		yearsOfExperience = y;
	}
	
	public void playInstrument() {
		System.out.println(name + " is playing the new " + instrument);
	}
	
	public void practice() {
		super.practice();
		System.out.println(name + " is REALLY REALLY practicing for " + yearsOfExperience + " year(s)");
	}
	
	public void perform() {
		super.perform();
		System.out.println(name + " is REALLY REALLY performing!");
	}
	
	public void practiceAtUniversity() {
		System.out.println(super.practice() + " at " + school);
	}
}


class starter {
	public static void main(String args[]) {
		Performer[] performer = new Performer[4];
		performer[0] = new Performer();
		performer[1] = new Musician();
		performer[2] = new Apprentice();
		performer[3] = new Actor();
		
		performer[0].perform();
		performer[0].practice();
		performer[1].perform();
		performer[0].practice();
		((Apprentice)performer[2]).practiceAtUniversity();
		((Musician)performer[1]).playInstrument();
		((Actor)performer[3]).monologue();
		performer[0].perform();
		
	}
}
