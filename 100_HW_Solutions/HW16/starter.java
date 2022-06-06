import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Clothing {
	int price;
	String clothingproducer;
	
	public Clothing() {
		price = 10;
		clothingproducer = "Hollister";
	}
	
	public Clothing(int x, String y) {
		price = x;
		clothingproducer = y;
	}
	
	public void setPrice(int x) {
		price = x;
	}
	
	public void setClothingproducer(String x) {
		clothingproducer = x;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getClothingproducer() {
		return clothingproducer;
	}
	
	public void GoodCustomerReaction() {
		System.out.println("The customer liked the price of " + price);
	}
	
	public void BadCustomerReaction() {
		System.out.println("The customer did not like the price of " + price);
	}
}

class Shirts extends Clothing {
	String material;
	
	public Shirts(int price, String clothingproducer, String x) {
		super(price, clothingproducer);
		material = x;
	}
	
	public void setMaterial(brand x) {
		material = x;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void GoodCustomerReaction() {
		super.GoodCustomerReaction();
		System.out.println("The customer liked the price of " + material);
	}
	
	public void BadCustomerReaction() {
		super.BadCustomerReaction();
		System.out.println("The customer did not like the price of " + material);
	}
}

class Pants extends Clothing {
	int length;
	
	public Pants(int price, String clothingproducer, int x) {
		super(price, clothingproducer);
		length = x;
	}
	
	public void setLength(int x) {
		length = x;
	}
	
	public int getLength() {
		return length;
	}
	
	public void GoodCustomerReaction() {
		super.GoodCustomerReaction();
		System.out.println("The customer liked the price of " + length);
	}
	
	public void BadCustomerReaction() {
		super.BadCustomerReaction();
		System.out.println("The customer did not like the price of " + length);
	}
}

class Socks extends Clothing {
	String typeofSocks;
	
	public Socks(int price, String clothingproducer, String x) {
		super(price, clothingproducer);
		typeofSocks = x;
	}
	
	public void typeofSocks(String x) {
		typeofSocks = x;
	}
	
	public String getTypeofSocks() {
		return typeofSocks;
	}
	
	public void GoodCustomerReaction() {
		super.GoodCustomerReaction();
		System.out.println("The customer liked the price of " + typeofSocks);
	}
	
	public void BadCustomerReaction() {
		super.BadCustomerReaction();
		System.out.println("The customer did not like the price of " + typeofSocks);
	}
}

class DesignerShirts extends Shirts {
	String brand;
	
	public DesignerShirts(int price, String clothingproducer, String material, String x) {
		super(price, clothingproducer, material);
		brand = x;
	}
	
	public void setBrand(String x) {
		brand = x;
	}
	
	public String getBrand() {
		return brand;
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
