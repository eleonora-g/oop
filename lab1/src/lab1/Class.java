package lab1;

import java.io.PrintStream;

public class Class {
	public String name;
	public String author;
	public float price;
	public int edition;
	
	public Class(String name, String author, float price, int edition ) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.edition = edition;
	}
	public Class(String name, String author, float price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.edition = 1;
	}
	public void SetPrice(float price) {
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %.1f %d\n", 
				name, author, price, edition);
	}
	public void printToFile(PrintStream stream) {
		stream.printf("%40s %30s %10.1f %2d\n", name, author, price, edition);
	}
}