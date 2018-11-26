package selfStudy.JavaExercisesArray;

public class ArrayQ1 {

	public static void main(String[] args) {
		
		int [] array1 = {102,-9,0,674,81};
		
		int i,j,temp=0;
		
		for(i=0; i<array1.length; i++) {
			for(j=0; j<array1.length-i-1; j++) {
				if(array1[j]>array1[j+1]) {
					temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1]= temp;
				}	
			}	
		}
	}
}
