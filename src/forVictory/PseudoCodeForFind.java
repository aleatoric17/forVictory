package forVictory;

public class PseudoCodeForFind {

	public static void main(String[] args) {

		int[] array = {1,5,-6,7};
		
		//For finding the smallest or biggest...?
		//Set variable called temp to 1st number
		//Compare temp to 2nd number, replace value of temp with the smaller value
		//Compare temp to 3rd number, replace value of temp with the smaller value
		//Repeat until the end...
		
		int temp = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(temp>array[i]) {
				temp=array[i];
			}
		}
		
		System.out.println("The smallest number is: " + temp);
		
	}

}
