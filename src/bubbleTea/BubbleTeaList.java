package bubbleTea;

import java.util.Arrays;

public class BubbleTeaList {

	private String ownerName;
	private BubbleTea[] bubbleTeas; 
	
	public BubbleTeaList(String ownerName, BubbleTea[] bubbleTeas) {
		this.ownerName = ownerName;
		this.bubbleTeas = bubbleTeas;
	}
	
	public BubbleTeaList(String ownerName, int numberOfBubbleTeas) {
		this.ownerName = ownerName;
		this.bubbleTeas = new BubbleTea[numberOfBubbleTeas];
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public BubbleTea[] getBubbleTeas() {
		return this.bubbleTeas;
	}
	
	public void setBubbleTeas(BubbleTea[] bubbleTeas) {
		this.bubbleTeas = bubbleTeas;
	}
	
//	public void addBubbleTea(String add) {
//		this.bubbleTeas = bubbleTeas + add;
//	}
//	
//	public void removeBubbleTea(String remove) {
//		this.bubbleTeas = bubbleTeas - remove;
//	}

	public int totalPrice() {
		int totalPrice = 0;
		for(int i=0; i<bubbleTeas.length; i++) {
			totalPrice += bubbleTeas[i].getPrice(); 
		}
		return totalPrice;
	}
	
	public String toString() {
		return "{Owner Name: " + this.ownerName + 
				". Bubble Teas: " + (Arrays.toString(this.bubbleTeas)) + "}";
	}

	
//	Sort array of BubbleTeas by price

	public void sortByPrice() {
		for(int i = 0; i < this.bubbleTeas.length - 1; i++) {
			
			for(int j = 0; j < this.bubbleTeas.length - 1; j++) {
				
				if( this.bubbleTeas[j].compareTo(this.bubbleTeas[j+1] ) < 0) {
					
					BubbleTea temp = this.bubbleTeas[j];
					this.bubbleTeas[j] = this.bubbleTeas[j+1];
					this.bubbleTeas[j+1] = temp;
					
				}
			}
		}
	}
//	1. compare price of 1st BubbleTea to 2nd BubbleTea
//	2. set a temp BubbleTea
//	3. Put the cheaper BubbleTea to 2nd index
//	4. Put the expensive BubbleTea to 1st index
//	5. Repeat n-1 times
//	6. Repeat step 2 - 4 until n-1 times

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	get
//	
//	set
//	
//	addBubbleTea
//	
//	removeBubbleTea
//	
//	totalPrice
//	
//	toString
//	
//	sortList
//	
//	
	
}
