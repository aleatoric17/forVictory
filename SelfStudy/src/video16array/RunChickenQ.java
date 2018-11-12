package video16array;

public class RunChickenQ
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float chicken[] = new float[6];
		//Identify 
		{
		chicken[0] = 3;
		chicken[1] = 5;
		chicken[2] = 1;
		chicken[3] = 3.4f;
		chicken[4] = 2;
		chicken[5] = 50;
		//Given variables
		}
		
		float all = 0;
		//Why
		
		for(int i = 0; i<6; i++)
		{
			all+= chicken[i];
		//How to use array
		}
		
		System.out.println ("Total weight is: " + all);
	}

}
