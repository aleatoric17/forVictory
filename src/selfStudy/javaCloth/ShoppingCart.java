package selfStudy.javaCloth;

import java.util.Arrays;

public class ShoppingCart {

	private Cloth[] items;
	private String ownerName;
	
	public ShoppingCart(String ownerName, Cloth[] items) {
		this.ownerName = ownerName;
		this.items = items;
	}
	
	public Cloth[] getItems() {
		return this.items;
	}
	
	public void setCloth(Cloth[] items) {
		this.items = items;
	}
	
	public int totalPrice() {
		int totalPrice = 0;
		for ( int i = 0 ; i < items.length ; i++ ) {
			totalPrice += items[i].getPrice();
		}
		return totalPrice;
	}
	
	public String toString() {
		return "{Owner Name: " + this.ownerName + 
				"... Items: " + (Arrays.toString(this.items)) + "}";
	}
	
	public void sortByPrice() {
		for(int i = 0; i < this.items.length - 1; i++) {
			for(int j = 0; j < this.items.length - 1; j++) {
				if(this.items[j].comparePriceTo(this.items[j+1]) < 0) {
					Cloth temp = this.items[j];
					this.items[j] = this.items[j+1];
					this.items[j+1] = temp;
				}
			}
		}
	}
	
	public void sortByBrand() {
		for(int i = 0; i < this.items.length - 1; i++) {
			for(int j = 0; j < this.items.length - 1; j++) {
				if(this.items[j].compareBrandTo(this.items[j+1]) > 0) {
					Cloth temp = this.items[j];
					this.items[j] = this.items[j+1];
					this.items[j+1] = temp;
				}
			}
		}
	}
	
}
