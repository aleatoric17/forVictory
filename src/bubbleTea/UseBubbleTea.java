package bubbleTea;

import java.util.Arrays;

public class UseBubbleTea {

	public static void main(String[] args) {

//		BubbleTea b1 = new BubbleTea(5,"Crazy Bubble");
//						
//		BubbleTea b2 = new BubbleTea(3,"Cheap Bubble");
		
//		System.out.println(b1.compareTo(b2));
//		
//		System.out.println("The price of this bubble tea is: " + b1.getPrice() + " and the name of this bubble tea is: " + b1.getName());
//		
//		b1.setPrice(7);
//		b1.setName("Amazing Bubble");
//		
//		System.out.println("The price of this bubble tea is: " + b1.getPrice() + " and the name of this bubble tea is: " + b1.getName());
//
//		System.out.println(b1.toString());
//		
		
//		int[] array1;
//		array1 = new int[3];
//		array1[0] = 1;
//		array1[1] = 7;
//		array1[2] = 12;
//		
//		System.out.println(Arrays.toString(array1));
//		
		
		BubbleTea[] youngList = new BubbleTea[3];
		
		
		youngList[0] = new BubbleTea(5, "Crazy", "Pudding");
		youngList[1] = new BubbleTea(10, "Rich", "Oreo Cookies + Jelly");
		youngList[2] = new BubbleTea(12, "Hungry", "Yay");
		
		System.out.println(youngList[1].getPrice());

		BubbleTea[] jamesList;
		jamesList = new BubbleTea[1];
		
		jamesList[0] = new BubbleTea(7, "Yellow");
		
		BubbleTeaList list1 = new BubbleTeaList("young's list", youngList);
		
		System.out.println(list1.totalPrice());
		
		System.out.println(list1.getOwnerName());
		
		list1.setOwnerName("yy's list");
		System.out.println(list1.getOwnerName());
		
		
		System.out.println(list1.getBubbleTeas()[0]);
		
		System.out.println(Arrays.toString(list1.getBubbleTeas()));
		
		System.out.println(list1.toString());
		
		list1.sortByPrice();
		
		System.out.println(list1.toString());
		
		
		
		
				
//		BubbleTeaList list2 = new BubbleTeaList("young's list", )
//		
//		BubbleTeaList list1 = new BubbleTeaList("james' list", 5);
//				
//		
//		System.out.println("We call this list as: " +list1.getOwnerName());
//		
		
		
		
//		System.out.println(list1.toString());

		
	}

}
