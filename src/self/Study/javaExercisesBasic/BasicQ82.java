package self.Study.javaExercisesBasic;

public class BasicQ82 {

	public static void main(String[] args) {

		int[] array = {20,30,40,50,67};
		
		if(array[0] > array[2] && array[0] > array[4]) {
			System.out.println("The largest n b/t first, third, fifth is: " + array[0]);
		}
		
		if(array[2] > array[0] && array[2] > array[4]) {
			System.out.println("The largest n b/t first, third, fifth is: " + array[2]);
		}
		
		if(array[4] > array[0] && array[4] > array[2]) {
			System.out.println("The largest n b/t first, third, fifth is: " + array[4]);
		}
		
	}

}
