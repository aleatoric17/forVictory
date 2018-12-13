package selfStudy.javaExercisesArray;

import java.util.Arrays;

public class ArrayQ1 {
	
	public static int[] sortIntArray(int[] unsortedArray) {
		
		int[] sortedArray = new int[unsortedArray.length];

		
		for(int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = unsortedArray[i];
		}
		
		for(int i = 0; i<sortedArray.length; i++) {
			for(int j=0; j < sortedArray.length - i - 1; j++) {
				if(sortedArray[j]>sortedArray[j+1]) {
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1]= temp;
				}	
			}	
		}
		return sortedArray;
	}

	
	
	public static void main(String[] args) {
		
		int [] question = {102,-9,0,674,81};

		
		int [] sortedQuestion = sortIntArray(question);
		System.out.println(Arrays.toString(question));
		System.out.println(Arrays.toString(sortedQuestion));
		
		
		
		//to bubble sort ascending order... 
		//it's called bubble sort...
		//imaging in each step it slowly bubbles up or down until the array is fully sorted
		
		//because it sort the larger value to right and smaller value to left in each step 
		//until the array is sorted in the correct order
		
		//1. compare 1st and 2nd value, put the smaller one to the 1st index, and larger one to the 2nd index
		//2. compare 2nd and 3rd value, put the smaller one to the 2nd index, and larger one to the 3rd index
		//3. repeat until n-1 times...
		//4. repeat step 1 to step 3 until n-1 times...	
		
		String[] str = {"james", "young", "james","rainie"};
		
		String sTemp;
		int x,y=0;
		
		for(y=0; y<str.length-1; y++) {
			for(x=0; x<str.length-1; x++) {
				if((str[x].compareTo(str[x+1])>0)) {
					sTemp=str[x];
					str[x]=str[x+1];
					str[x+1]=sTemp;
				}
			}
		}
		
		System.out.println(Arrays.toString(str));
		
	}
}
