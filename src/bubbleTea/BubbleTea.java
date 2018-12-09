package bubbleTea;

public class BubbleTea {

	private int price;
	private String name;
	private String addon;
	
	public BubbleTea(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public BubbleTea(int price, String name, String addon) {
		this.price = price;
		this.name = name;
		this.addon = addon;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return "{price: " + this.price + ", Name: " + this.name + "}";
	}
	
	
	public int compareTo(BubbleTea bt) {
		if (this.price < bt.getPrice()) {
			return -1;
		} else if (this.price > bt.getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
