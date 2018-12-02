package selfStudy.sortArray;

import java.util.Arrays;

public class PseudoCode {

	public static void main(String[] args) {

		int [] array = {1,5,0,4,9,-78,9};
		
		//to bubble sort ascending order... 
		//it's called bubble sort...
		//imaging in each step it slowly bubbles up or down until the array is fully sorted
		
		//because it sort the larger value to right and smaller value to left in each step 
		//until the array is sorted in the correct order
		
		//1. compare 1st and 2nd number, put the smaller one to the 1st index, and larger one to the 2nd index
		//2. compare 2nd and 3rd number, put the smaller one to the 2nd index, and larger one to the 3rd index
		//3. repeat until n-1 times...
		//4. repeat step 1 to step 3 until n-1 times...
		
		int i,j,temp;
		
		for(j=0; j<array.length-1; j++) {	
			for(i=0; i<array.length-1; i++) {
				if(array[i]>array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		
		System.out.println("The sorted array is: " + Arrays.toString(array));
	}
}
