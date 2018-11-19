package selfStudy.video17array;

public class RunDog 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog dogs[] = new Dog[4];
		
		dogs[0] = new Dog();
		dogs[0].setName("Flower");
		dogs[0].setWeight(4.5f);
		
		dogs[1] = new Dog();
		dogs[1].setName("Udon");
		dogs[1].setWeight(8.5f);
		
		dogs[2] = new Dog();
		dogs[2].setName("Mochi");
		dogs[2].setWeight(25.2f);
		
		dogs[3] = new Dog();
		dogs[3].setName("Shadow");
		dogs[3].setWeight(30.2f);
		
//		Refer to Video 16 41:00
//		for(int i=0; i<4; i++)
//		{
//			dogs[i] = new Dog();
//			System.out.println("Please enter the name of your dog");
//		}
		
		float maxWeight = dogs[0].getWeight();
//		We assume the first dog has the max weight...		
		int maxIndex = 0;
		
		for(int i=1; i<dogs.length; i++)
		{
			if(maxWeight < dogs[i].getWeight())
			{
				maxWeight = dogs[i].getWeight();
				maxIndex = i;
			}
		}
		
		System.out.println("The dog that weights the most is: " + maxWeight + " name " + dogs[maxIndex].getName());
	}

}
