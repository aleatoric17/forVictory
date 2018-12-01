package selfStudy.JavaExercisesArray;

public class ArrayQ4 {

	public static void main(String[] args) {

		int[] array = {10,6,94,-7,12};
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		int avg = sum/array.length;
		
		System.out.println("The sum of array is: " + sum);
		System.out.println("The avg of sum of array is: " + avg);
		
		
	}

}
