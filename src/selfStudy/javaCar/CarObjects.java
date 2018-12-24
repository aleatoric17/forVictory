package selfStudy.javaCar;

public class CarObjects {

	public static void main(String[] args) {

		Car c01;
		c01 = new Car("BMW", "M5", 102700);
		
		Car c02;
		c02 = new Car("Tesla", "S", 78000);
		
		Car c03;
		c03 = new Car("Porsche", "911 Turbo", 209500);
		
//		System.out.println(c01.comparePriceTo(c02));
		
		System.out.println(c01);
		
		System.out.println(c02.toString());
		
		System.out.println(c03.toString());
		
		System.out.println(c03.toDiscount(.5));
		
		System.out.println(c03.toString());
		
		System.out.println(c01.compareBrandTo(c02));
		
	}

}