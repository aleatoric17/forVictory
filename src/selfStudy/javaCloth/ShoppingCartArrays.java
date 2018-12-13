package selfStudy.javaCloth;

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
//		
//		System.out.println(list1.toString());
//		When I run above codes, it prints
//		Sex: null
//		Brand: Off White
//		Size: null
//		Type: null
//		Price: 600
//		Question is: Does it always print every properties?
		
		ShoppingCart list1 = new ShoppingCart("Mengqing's List", mengQings);
		
		System.out.println("{Total Price: " + list1.totalPrice() + "}");
		
		System.out.println(list1.toString());
		
		list1.sortByBrand();
		
		System.out.println(list1.toString());
		
		list1.sortByPrice();
		
		System.out.println(list1.toString());
		
		mengQings[0].setPrice(500);
		
		System.out.println(mengQings[0].getPrice());

		
	}

}
