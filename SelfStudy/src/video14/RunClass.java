package video14;

public class RunClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int i = 1;
		//created a variable name i type int given 1
		
		String temp = "hello";
		//create a variable name temp type String given hello
		
		Dog dog1;
		dog1 = new Dog("James",3);
		//create a variable name dog1 with type Dog
		//assigning a new dog object given it String name James and int age 3 to dog1
		
		
		
		
		
		
		
		Dog dog2 = new Dog();
	
		//an object does not require to have a constructor, 
		//because there's a default constructor built in Java...
		dog1.cry();
		
		System.out.println(dog1.name);
		//created a label in the memory space with public static called main
		//with no return type, storing the implementation between brackets
		//inside that memory space, that 
	}

}
