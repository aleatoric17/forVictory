package selfStudy.javaCloth;

import java.util.Arrays;

public class ShoppingCart {

	private Cloth[] cart;
	private String ownerName;
	
	public ShoppingCart(String ownerName, Cloth[] items) {
		this.ownerName = ownerName;
		this.cart = items;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String tempName) {
		this.ownerName = tempName;
	}
	
	public Cloth[] getCart() {
		return this.cart;
	}
	
	public void setCloth(Cloth[] tempItems) {
		this.cart = tempItems;
	}
	
	public int totalPrice() {
		int totalPrice = 0;
		for ( int i = 0 ; i < cart.length ; i++ ) {
			totalPrice += cart[i].getPrice();
		}
		return totalPrice;
	}
	
	public String toString() {
		return "{Owner Name: " + this.ownerName + 
				"... Items: " + (Arrays.toString(this.cart)) + "}";
	}
	
	public void sortByPrice() {
		for(int i = 0; i < this.cart.length - 1; i++) {
			for(int j = 0; j < this.cart.length - 1; j++) {
				if(this.cart[j].compareToByPrice(this.cart[j+1]) < 0) {
					Cloth temp = this.cart[j];
					this.cart[j] = this.cart[j+1];
					this.cart[j+1] = temp;
				}
			}
		}
	}
	
	public void sortByBrand() {
		for(int i = 0; i < this.cart.length - 1; i++) {
			for(int j = 0; j < this.cart.length - 1; j++) {
				if(this.cart[j].compareToByBrand(this.cart[j+1]) > 0) {
					Cloth temp = this.cart[j];
					this.cart[j] = this.cart[j+1];
					this.cart[j+1] = temp;
				}
			}
		}
	}
	
}
