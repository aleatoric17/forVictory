package video17sort;

public class RunBubble 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		
		int a[] = {1,6,0,-1,9,7,9,10};
			
		Bubble annie = new Bubble();
		annie.sort(a);
	
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}		
	}
}
