package self.Study.javaExercisesBasic;

import java.util.Arrays;

public class BasicQ83 {

	public static void main(String[] args) {

		int[] array1 = {1,3,-5,4};
		int[] array2 = {1,4,-5,-2};
		int [] result = {array1[0]*array2[0], array1[1]*array2[1], array1[2]*array2[2], array1[3]*array2[3]};
		
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("After multiply, the result is: " + Arrays.toString(result));
		
	}

}
