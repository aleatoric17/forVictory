package selfStudy.javaExercisesBasic;

import java.util.Arrays;

public class BasicQ77 {

	public static void main(String[] args) {
		
		int[] array1 = {50,-20,0};
		int[] array2 = {5,-50,10};
		
		int[] newArray = {array1[0],array2[array2.length-1]};
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(newArray));
		
	}

}
