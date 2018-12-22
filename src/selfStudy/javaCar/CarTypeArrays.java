package selfStudy.javaCar;

public class CarTypeArrays {

	public static void main(String[] args) {

		Car[] coupe;
	//	int x;
		coupe = new Car[3];
	//	x = 5;
		
		coupe[0] = new Car("BMW", "M4", 69150);
		coupe[1] = new Car("Porsche", "911", 91000);
		coupe[2] = new Car("Lamborghini", "Huracan", 199800);
		
		CarType coupeList1 = new CarType("Young", coupe);
		
		System.out.println(coupeList1.getOwnerName());
		
		System.out.println(coupeList1.setOwnerName("James"));
		
		
		
	}

}
