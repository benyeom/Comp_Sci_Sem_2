import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Bird {
    String name;
    int age;
    boolean trained;
    
    public Bird() {
        name = "";
        age = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setTrained(boolean trained) {
        this.trained = trained;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean getTrained() {
        return trained;
    }
    
    public Bird(String name, boolean trained) {
	    this.name = name;
	    this.trained = trained;
	}
	
	public Bird(String name, int age, boolean trained) {
	    this.name = name;
	    this.age = age;
	    this.trained = trained;
	}
	
	public void interact() {
        if (trained) {
            System.out.print(name + " drank water");
        }
    }
    
    public void trick() {
        System.out.print(name + " ran on the treadmill");
    }
}

class Hamster {
    String name;
    int age;
    boolean trained;
    
    public Hamster() {
        name = "";
        age = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setTrained(boolean trained) {
        this.trained = trained;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean getTrained() {
        return trained;
    }
    
    public Hamster(String name, boolean trained) {
	    this.name = name;
	    this.trained = trained;
	}
	
	public Hamster(String name, int age, boolean trained) {
	    this.name = name;
	    this.age = age;
	    this.trained = trained;
	}
	
	public void interact() {
        if (trained) {
            System.out.print(name + " drank water");
        }
    }
    
    public void trick() {
        System.out.print(name + " ran on the treadmill");
    }
}

class starter {
	public static void main(String args[]) {
	    Bird[] bird = new Bird[5];
	    Hamster[] hamster = new Hamster[5];
		
		Bird Snoopy = new Bird();						// Default Constructor
		Bird Snoopy2 = new Bird(36);					// Age Constructor
		Bird Snoop3 = new Bird(true);					// Trained Constructor
		Bird Toto = new Bird("Toto");					// Name Constructor
		Bird Clifford = new Bird("Clifford", true);	// Name, Trained Constructor
		Bird Scooby = new Bird("Scooby", 50, false);	// Name, Age, Trained Constructor

		Hamster Felix = new Hamster("Felix", 100, true);	// Name, Age, Trained Constructor

		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
		
	}
}