package selfStudy.video16array;

public class SkateRace 
{
	public static void main(String[] args) 
	{
		float skate[] = new float [5];
		//it can also be written as:
		//float[] skate;
		//skate = new float[5];
		{
		skate[0] = 10;
		skate[1] = 12;
		skate[2] = 5.7f;
		skate[3] = 9;
		skate[4] = 14;
		
		float all = 0;
		
		for (int i = 0; i<5; i++)
			{
				all+= skate[i];
			}
		
		float avg = all/5;
		
		System.out.println("The avg time is: " + avg);
		}
	}

}
