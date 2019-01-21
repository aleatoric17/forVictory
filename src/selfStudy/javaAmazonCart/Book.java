package selfStudy.javaAmazonCart;

import java.io.IOException;

public class Book extends Item{

	String material = "";
	String publisher = "";

	
	public Book(String material, String publisher) throws IOException  {
		this.material = material;
		this.publisher = publisher;
		this.category = "book";
		this.itemNo = this.generateItemNo();
	}
	
	public String generateItemNo() {
		return this.category + "-" + this.getMaterial() + "-" + this.publisher;
	}
	
	public int retreivePrice() {
		//TODO write retreivePirce implementation 
		return 0;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return "{Category: " + this.category + ", Material: " + this.material + ", Publisher: " + this.publisher +"}";
	}
		
}
