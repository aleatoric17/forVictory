package selfStudy.sortArray;

import java.util.Arrays;

public class OneWaySortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,temp = 0; 
		String arrayString;
		
		int array[] = {1,2,-5,3,-9,7,8};
		
		for (i=0; i<array.length-1; i++) {
		//outer loop, how many times to run the loop	
			for (j=0; j<array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array [j];
					array [j] = array[j+1];
					array[j+1] = temp;
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