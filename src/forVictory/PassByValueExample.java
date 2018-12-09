package forVictory;

public class PassByValueExample {
	
	public static void main(String[] args) {
		
		//Proof Java is always pass by Value
		
		int firstNumber;
		firstNumber = 20;
		
		int secondNumber = 99;
		
		System.out.println("Before swap : " + firstNumber + " and " + secondNumber);
		
		swap(firstNumber, secondNumber);
		

		System.out.println("After swap : " + firstNumber + " and " + secondNumber);
	}
	
	//In this function, java clones the value of the variable firstNumber and secondNumber, then pass the cloned values into x and y
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("Within the function : firstNumber = " + x);

		System.out.println("Within the function : secondNumber = " + y);
		
	}

}
