package selfStudy.javaAmazonCart;

import java.io.IOException;

public class Item {
	
	protected String itemNo = "";
	//Why do we have itemNo? 
	//Because itemNo is the unique identifier between each product...
	
	//itemNo is created by the category name and its properties
	//and by requirement, separate word by "-"
	//ie: Cloth category, size Small, brand zara, itemNo would be "cloth-small-zara"
	//ie: Book category, material Paper Back, publisher viking, itemNo would be "book-paperback-viking"...
	protected int price = 0;
	protected String category = "item";
	RetrievePrice retrievePrice = new RetrievePrice();
	
	public Item() throws IOException {
		this.price = retrievePrice.getPriceMap().get(this.itemNo);
	}
	
	public String getItemNo() {
		return this.itemNo;
	}

	public int getPrice() {
		return this.price;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	

}
