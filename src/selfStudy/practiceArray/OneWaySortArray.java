package selfStudy.practiceArray;

import java.util.Arrays;

public class OneWaySortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp; 
		String arrayString;
		
		int array[] = {12,35,1,7,98,74,55};
		
		for (int i=0; i<array.length-1; i++) {
		//outer loop, how many times to run the loop	
			for (int j=i+1; j<array.length; j++) {
				if (array[i] > array[j]) {
					temp = array [j];
					array [j] = array[i];
					array[i] = temp;
				}
			}
			//inner loop, compare number individually
			//if the first number > second number
			//then switch...
		}
		
			arrayString = Arrays.toString(array);
	
			System.out.println(arrayString);
				
	}
}