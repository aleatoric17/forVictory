package selfStudy.video14;

public class Dog extends Animal
{
	public void cry()
	{
		System.out.println("Dog barks");
		//created a label in the memory space with public method 
		//called cry with no return type
		//storing the implementation between the brackets 
		//inside that memory space
		//the implementation is to print out that Dogs bark
	}
	
	public Dog(String n, int a)
	{
		//created a label in the memory space with public constructor
		//needing parameters a string and an int,
		//storing the implementation between the brackets
		//inside that memory space
		
		this.name = n;
		this.age = a;
		//property name extends from Animal given it value n
		//property age extends from Animal given it value a
	}
	
	//two functions with the same name, 
	//is called method overload...
	public Dog() 
	{
		this.name = "defaultname";
		this.age = 0;

		//created a label in the memory space with public constructor
		//does not have parameters
		//storing the implementation between the brackets
		//inside that memory space...
	}
	
//created a label in the memory space with public class
//called Dog extends Animal,
//storing the implementation between the brackets in side that memory space
}
