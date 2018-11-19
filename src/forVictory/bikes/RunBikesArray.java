package forVictory.bikes;

public class RunBikesArray {

	public static void main(String[] args) {

		
		Bike b1 = new Bike("Mountain Bike", 120, 500);
		//create a variable name b1 in type Bike
		//create a new Bike by calling its constructor
		//then assign the newly created Bike to b1		
		
		System.out.println(b1.getName());
		
		b1.setName("Road Bike");
		
		System.out.println(b1.getName());
		
		
		Bike b2 = new Bike("Space Bike", 100.50, 799.99);
		//create a variable name b2 in type Bike
		//create a new Bike by calling its constructor
		//then assign the newly created Bike to b2
		
		Bike b3 = new Bike("Water Bike", 190.75, 300);
		//create a variable name b3 in type Bike
		//create a new Bike by calling its constructor
		//then assign the newly created Bike to b3
		
		double totalPrice = b1.getPrice() + b2.getPrice() + b3.getPrice();
		
		System.out.println("The total price of 3 bikes is: " + totalPrice);
		
		
		Bike bikeArray[] = {b1, b2, b3};
		
		System.out.println( bikeArray[0].getName() );
		
		double totalP = bikeArray[0].getPrice() + bikeArray[1].getPrice() + bikeArray[2].getPrice();
		
		
		
	}

}
