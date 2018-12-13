package selfStudy.javaExercisesBasic;

public class BasicQ76 {

	public static void main(String[] args) {

		int[] array1 = {50,-20,0,30,40,60,12};
		int[] array2 = {45,20,10,20,30,50,11};
		
		if(array1[0]==array1[array1.length-1]  ||  array2[0]==array2[array2.length-1]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
