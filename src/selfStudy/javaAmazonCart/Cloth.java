package selfStudy.javaAmazonCart;

import java.io.IOException;

public class Cloth extends Item{

	private String brand = "";
	private String size = "";

	public Cloth(String brand, String size) throws IOException  {
		this.brand = brand;
		this.size = size;
		this.category = "cloth";
		this.itemNo = this.generateItemNo();
	}
	
	public String generateItemNo() {
		return this.category + "-" + this.getBrand() + "-" + this.size;
	}
	
	public int retreivePrice() {
		//TODO write retreivePirce implementation 
		return 0;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public String toString() {
		return "{Category: " + this.category + ", Brand: " + this.brand + ", Size: " + this.size +"}";
	}
	
	
	
}
