package selfStudy.javaExercisesArray;

import java.util.Arrays;

public class ArrayQ2 {

	public static void main(String[] args) {
		
		int array1[] = {6,12,-5,88,198,-93};
		
		int sum=0;

//		for(int i: array1)
//			sum += i;
		
		for(int i=0; i<array1.length; i++) {
			sum += array1[i];
		}
		
		System.out.println("The sum values of array1 is: " + sum);
		
	}
}
