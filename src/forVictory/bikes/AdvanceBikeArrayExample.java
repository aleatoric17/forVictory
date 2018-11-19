package forVictory.bikes;

public class AdvanceBikeArrayExample {
	
	
	public static void main (String[] args) {

		Bike b1 = new Bike("Mountain Bike", 120, 500);
		Bike b2 = new Bike("Mountain Bike", 120, 500);
		Bike b3 = new Bike("Mountain Bike", 120, 500);
		Bike b4 = new Bike("Mountain Bike", 120, 500);
		Bike b5 = new Bike("Mountain Bike", 120, 500);
		Bike b6 = new Bike("Mountain Bike", 120, 500);
		Bike b7 = new Bike("Mountain Bike", 120, 500);
		Bike b8 = new Bike("Mountain Bike", 120, 500);
		Bike b9 = new Bike("Mountain Bike", 120, 500);
		Bike b10 = new Bike("Mountain Bike", 120, 500);
		Bike b11 = new Bike("Mountain Bike", 120, 500);
		Bike b12 = new Bike("Mountain Bike", 120, 500);
		Bike b13 = new Bike("Mountain Bike", 120, 500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		Bike bikeArray[] = {b1, b2, b3, b4, b5, b6, b7,b8, b9, b10, b11, b12, b13};
		double totalPrice = 0;
		
		for(int i = 0; i<bikeArray.length; i++) {
			totalPrice += bikeArray[i].getPrice();
		}
		
		System.out.println("The total price is: " + totalPrice);
		
		
		

		
	}

}
