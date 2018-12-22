package selfStudy.javaCloth;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCartArrays {

	public static void main(String[] args) {

		Cloth[] mengQings;
		mengQings = new Cloth[3];
		
		mengQings[0] = new Cloth("F", "Off White", "S", "top", 600);
		mengQings[1] = new Cloth("F", "Theory", "S", "coat", 780);
		mengQings[2] = new Cloth("F", "Acne Studio", "S", "top", 450);
		
		
//		mengQings[0] = new Cloth("Off White", 600);
//		mengQings[1] = new Cloth("Theory", 780);
//		mengQings[2] = new Cloth("Acne Studio", 450);
		
		

//		System.out.println(list1.toString());
//		When I run above codes, it prints
//		Sex: null
//		Brand: Off White
//		Size: null
//		Type: null
//		Price: 600
//		Question is: Does it always print every properties?
		
//		ShoppingCart list1 = new ShoppingCart("Mengqing's Cart", mengQings);
//		
//		System.out.println(Arrays.toString(list1.getCart()));
//	
//		System.out.println(list1.getCart()[0].toString());
		
//		System.out.println(list1.getOwnerName());
//		
//		list1.setOwnerName("MQ's Cart");
//		
//		System.out.println(list1.getOwnerName());
//		
//		System.out.println(list1.getCart()[2]);
//		
//		System.out.println(list1.getCart()[0].getBrand());
//		
//		System.out.println(Arrays.toString(mengQings));
		
//		System.out.println("{Total Price: " + list1.totalPrice() + "}");
//		
//		System.out.println(list1.toString());
//		
//		list1.sortByBrand();
//		
//		System.out.println(list1.toString());
//		
//		list1.sortByPrice();
//		
//		System.out.println(list1.toString());
//		
//		mengQings[0].setPrice(500);
//		
//		System.out.println(mengQings[0].getPrice());
		
		
		
		

		ArrayList<Cloth> p1;
		p1 = new ArrayList<Cloth>(1);
		
		p1.add(0, new Cloth("F", "Off White", "S", "top", 600));
		p1.add(1, new Cloth("M", "Off Blue", "S", "top", 600));
//		p1.add(1, null);
		
		p1.add(2, new Cloth("Acne Studio", 450));
		
		p1.add(3, new Cloth("Acne Studio", 100));
		
//		System.out.println(p1.toString());
		
		p1.add(new Cloth("Mango", 800));
		
//		System.out.println(p1.toString());



//		ArrayList<Cloth> p2;
//		p2 = new ArrayList<Cloth>();
//		for (int i = 0; i < 5; i ++) {
//			p2.add(null);
//		}
		
//		System.out.println(p2.toString());
		
//		System.out.println(p1.toString());
//		p1.clear();
//		System.out.println(p1.toString());
		System.out.println(p1.toString());
		
		
		

		
	}

}
