package selfStudy.javaAmazonCart;

import java.io.IOException;
import java.util.ArrayList;

public class ShoppingCartArrayList {

	public static void main(String[] args) throws IOException {

//		Cloth cloth2 = new Cloth("zara", "small");
//		Item item2 = (Item)cloth2;
//		
//		System.out.println(cloth2.getPrice());
//		System.out.println(item2.getPrice());
//		System.out.println(cloth2.getBrand());
//		System.out.println(((Cloth) item2).getBrand());
	
		ArrayList<Item> shoppingCart = new ArrayList();
		
		Item newItem = new Cloth("blah", "hiya");
		
		
		Cloth cloth1 = new Cloth("zara", "small");
		Book book1 = new Book("paperback", "plume");
//		paperback material plume publisher, the price: $10
		Book book2 = new Book("hardcover", "penguin");
//		hardcover material penguin publisher, the price: $30
		Book book3 = new Book("paperback", "viking");
//		paperback material viking publisher, the price: $15
		shoppingCart.add(cloth1);
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		
//		System.out.println(shoppingCart.toString());
//		
//		System.out.println(cloth1.getCategory());
//		
//		System.out.println(book1.getItemNo());
//		System.out.println(book2.getItemNo());
//		System.out.println(book3.getItemNo());
		
		Book book4 = new Book("hardcover", "tiger");
		
		System.out.println(shoppingCart.get(0).getPrice());
		
	
		
		
		
//		control shift O = eclipse function to add the utility you need...
		
		
		
		
		
	}

}
