package selfStudy.javaCloth;

public class ClothObjects {

	public static void main(String[] args) {

		Cloth c01;
		c01 = new Cloth("F", "LV", "S", "cashmere", 400);
		
		Cloth c02;
		c02 = new Cloth("F", "Gucci", "L", "silk", 250);
		
		Cloth c03;
		c03 = new Cloth("M", "stussy", "XL", "cotton", 124);
		
		System.out.println(c01.getPrice());
		
		c01.setPrice(350);
		
		System.out.println(c01.getPrice());
		
		System.out.println(c01.comparePriceTo(c02));
		
		System.out.println(c01.toString());

		System.out.println(c02.toString());
		
		System.out.println(c03.toString());
		
		System.out.println(c01.getBrand().compareTo(c02.getBrand()));
		
		
		
		

	}
}	

