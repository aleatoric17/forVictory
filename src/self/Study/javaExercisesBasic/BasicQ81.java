package self.Study.javaExercisesBasic;

import java.util.Arrays;

public class BasicQ81 {

	public static void main(String[] args) {

		int[] original = {20,30,40};
		int[] swap = {original[2],original[1],original[0]};
		
		System.out.println("Original Array is: " + Arrays.toString(original));
		System.out.println("Swapped Array is: " + Arrays.toString(swap));
		
	}

}
