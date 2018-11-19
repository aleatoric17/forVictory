package selfStudy.javaPractice;

//import java.util.Scanner;
//
//public class JavaBasicExercises 
//{
//
//	public static void main(String[] args) 
//	{
		// TODO Auto-generated method stub
		
//		----------------------------------------------------------------------------------------------
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Input first#: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("Input second#: ");
//		int num2 = in.nextInt();
//		
//		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		
//		----------------------------------------------------------------------------------------------
		
		//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Input 1st #: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("Input 2nd #: ");
//		int num2 = in.nextInt();
//		
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
//		System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
//		System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
		
//		----------------------------------------------------------------------------------------------
		
		//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter first number: ");
//		int num1 = in.nextInt();
//		
//		for (int i = 1; i < 10; i++)
//		{
//			System.out.println(num1 + " x " + i + " = " + (num1*i));
//		}
//		----------------------------------------------------------------------------------------------
//		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//		----------------------------------------------------------------------------------------------
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("1st #: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("2st #: ");
//		int num2 = in.nextInt();
//		
//		System.out.print("3st #: ");
//		int num3 = in.nextInt();
//		
//		System.out.println("the avg of the three numbers is: " + ((num1+num2+num3)/3));
//		----------------------------------------------------------------------------------------------		
		
//		int a, b, temp;
//		a = 15;
//		b = 27;
//		System.out.println("Before swapping : a, b = " +a+ ", "+ b);
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After swapping: a, b = " +a+ ", "+ b);
//		----------------------------------------------------------------------------------------------		
//		 System.out.println("\nJava Version: "+System.getProperty("java.version"));
//		 System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//		 System.out.println("Java Home: "+System.getProperty("java.home"));
//		 System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//		 System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//		 System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
//		----------------------------------------------------------------------------------------------		
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter first #: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("Enter second #: ");
//		int num2 = in.nextInt();
//				
//		if(num1 == num2)
//			System.out.println(num1 + " == " + num2);
//		if(num1 != num2)
//			System.out.println(num1 + " != " + num2);
//		if(num1 < num2)
//			System.out.println(num1 + " < " + num2);
//		if(num1 <= num2)
//			System.out.println(num1 + " is less or equal to " + num2);
//		if(num1 > num2)
//			System.out.println(num1 + " > " + num2);
//		if(num1 >= num2)
//			System.out.println(num1 + " is greater or equal to " + num2);
//		----------------------------------------------------------------------------------------------		
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter #1: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("Enter #2: ");
//		int num2 = in.nextInt();
//		
//		System.out.println("The sum of those two numbers is " + (num1+num2));
//		----------------------------------------------------------------------------------------------		
		
//		for(int i = 1; i < 100; i++)
//		{
//			if (i % 2 != 0)
//			{
//				System.out.println(i);
//			}
//		}
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("Input a number: ");
//		int n = in.nextInt();
//		if (n % 2 == 0)
//		{
//			System.out.println(1);
//		}
//		else
//		{
//			System.out.println(0);
//		}
		
//		for( int i = 1; i < 100; i++)
//		{
//			if (i % 3 == 0)
//			{
//				System.out.println(i);
//			}
//		}
//		
//		for( int i = 1; i < 100; i++)
//		{
//			if (i % 5 == 0)
//			{
//				System.out.println(i);
//			}
//		}
//		
//		for( int i = 1; i < 100; i++)
//		{
//			if (i % 3 == 0 && i % 5 == 0)
//			{
//				System.out.println(i);
//			}
//		}
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("Input Fahrenheit: ");
//		
//		double f = in.nextInt();
//		double c = ((5*(f-32))/9.0);
//		
//		System.out.println(f+"F is equal to " + c +"C");
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("Input inch: ");
//		
//		double i = in.nextInt();
//		double m = (i*0.0254);
//		
//		System.out.println( i + " inches is equal to " + m + " meters!");
//		
//		
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("Input a number: ");
//		int n = in.nextInt();
//		
//		int firstDigit = n % 10;
//      int remainingNumber = n / 10;
//      int secondDigit = remainingNumber % 10;
//      System.out.println(secondDigit);
//      remainingNumber = remainingNumber / 10;
//      int thirdDigit = remainingNumber % 10;
//      remainingNumber = remainingNumber / 10;
//      int fourthDigit = remainingNumber % 10;
//      int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;
//      System.out.println("The sum of all digits in " + n + " is " + sum);
        
//		Scanner in = new Scanner (System.in);
//		System.out.print("Input your minutes: ");
//		
//		int m = in.nextInt();
//		int totalDays = ((m / 60)/24);
//		int days = (totalDays % 365);
//		int years = ((totalDays/365));
//		
//		System.out.println ( m + " in minutes equal to " + years + " years " + days + " days ");
		
//		Scanner in = new Scanner (System.in);
//
//		System.out.print ("input distance in meters: ");
//		float meter = in.nextInt();
//		System.out.print ("input hours: ");
//		float hour = in.nextInt();
//		System.out.print ("input minutes: ");
//		float minute = in.nextInt();
//		System.out.print ("input seconds: ");
//		float second = in.nextInt();
//		
//		float km = (meter/1000);
//		
//		float mPs = (meter/(second + (minute*60) + (hour*60*60)));
//		float kmPh = (km/(hour + (minute/60) + ((second/60)/60)));
//		System.out.println("your meter per second is: " + mPs + " and your km per hour is " + kmPh);
//		
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("Please input 1st number: ");
//		int n1 = in.nextInt();
//		System.out.print("Please input 2nd number: ");
//		int n2 = in.nextInt();
//		
//		System.out.println (n1+n2);
//		System.out.println (n1-n2);
//		System.out.println (n1*n2);
//		System.out.println ((n1+n2)/2);
//		System.out.println (Math.max(n1, n2));
//		System.out.println (Math.min(n1, n2));
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("enter a number pls: ");
//		
//		int n = in.nextInt();
//		int firstD = (n % 10);
//		int remainderOne = n / 10;
//		int secondD = (remainderOne % 10);
//		int remainderTwo = (remainderOne / 10);
//		
//		System.out.println ("breaking down is: " + secondD + ", " + firstD );
		
//		Scanner in = new Scanner (System.in);
//		System.out.print ("Input a number: ");
//		
//		int n = in.nextInt();
//		
//		if (n > 0)
//		{
//			System.out.println("Positive");
//		}
//		else if (n < 0)
//		{
//			System.out.println("Negative");
//		}
//		else
//		{
//			System.out.println("Zero");
//		}
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("Input first number: ");
//		int n1 = in.nextInt();
//		System.out.print("Input second number: ");
//		int n2 = in.nextInt();
//		System.out.print("Input third number: ");
//		int n3 = in.nextInt();
//		
//		if ( n1 > n2 )
//			if ( n1 > n3 )
//				System.out.println("the greatest number is: "+ n1);
//		if ( n2 > n1 )
//			if (n2 > n3)
//				System.out.println("the greatest number is: "+ n2);
//		if (n3>n1)
//			if (n3>n2)
//				System.out.println("the greatest number is: "+ n3);
		
//		Scanner in = new Scanner (System.in);
//		System.out.print("Enter value: ");
//		int m = in.nextInt();
//		
//		if ( m > 0 )
//		{
//			System.out.println ("n is 1");
//		}
//		else if ( m < 0 )
//		{
//			System.out.println ("n is -1");
//		}
//		else
//		{
//			System.out.println ("n is 0");
//		}
//		
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("Input a Sentence: ");
//		String line = in.nextLine();
//		String[] words = line.split("[ ]+");
//		System.out.println("Penultimate word: "+words[words.length - 2]);


//Q63
//import java.util.*;
//public class JavaBasicExercises {
//public static void main(String[] args)
//   {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Input the first number : ");
//       int a = in.nextInt();  
//       System.out.print("Input the second number: ");
//       int b = in.nextInt(); 
////       System.out.println("Result: "+result(a, b));
//       
//       if (a == b)
//    	   System.out.println("Result: 0");
//       if (a > b)
//    	   System.out.println("Result: " + a);
//       if (a < b)
//    	   System.out.println("Result: " + b);
//       if ((a%6 == b%6) && (a > b))
//    	   System.out.println("Result: " + b);
//       if ((a%6 == b%6) && (a < b))
//    	   System.out.println("Result: " + a);
//       
//   }
////	public static int result(int x, int y)
////    {  
////	if(x == y)
////		return 0;
////	    if(x % 6 == y % 6)
////		    return (x < y) ? x : y;
////	    return (x > y) ? x : y;
////    }
//}




//java conditional statement, Q5
//import java.util.Scanner;
//public class JavaBasicExercises {
//
//    
//  public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int d = in.nextInt();
//
//        if (d == 1)
//        	System.out.println("Monday");
//        if (d == 2)
//        	System.out.println("Tues");
//        if (d == 3)
//        	System.out.println("Wed");
//        if (d == 4)
//        	System.out.println("Thurs");
//        if (d == 5)
//        	System.out.println("Fri");
//        if (d == 6)
//        	System.out.println("Sat"); 
//        if (d == 7)
//            System.out.println("Sun");
//}
//
//    // Get the name for the Week
//    public static String getDayName(int day) {
//        String dayName = "";
//        switch (day) {
//            case 1: dayName = "Monday"; break;
//            case 2: dayName = "Tuesday"; break;
//            case 3: dayName = "Wednesday"; break;
//            case 4: dayName = "Thursday"; break;
//            case 5: dayName = "Friday"; break;
//            case 6: dayName = "Saturday"; break;
//            case 7: dayName = "Sunday"; break;
//            default:dayName = "Invalid day range";
//        }
//
//        return dayName;
//    }
//}

//Q152
//import java.util.Scanner;
//public class JavaBasicExercises {
//	public static void main(String[] args) {
//		 Scanner in = new Scanner(System.in);
//		 System.out.print("Input first number: ");
//         int n1 = in.nextInt();
//         System.out.print("Input second number: ");
//         int n2 = in.nextInt();
//		 System.out.print("Input third number: ");
//         int n3 = in.nextInt();
//         System.out.print("Input fourth number: ");
//         int n4 = in.nextInt();		
//		
//		if (n1 == n2 && n2 == n3 && n3 == n4) {
//			System.out.println("Numbers are equal.");
//		}else{
//			System.out.println("Numbers are not equal!");}
//	}
//}

//Q67
//import java.lang.*;
//public class JavaBasicExercises{
//public static void main(String[] args)
//{
//  String main_string = "Python 3.0";
//  String word = "Tutorial";
//  System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
//	}
//}
//

////Q74
//public class JavaBasicExercises {
//public static void main(String[] args)
//{
//   int[] numArray = {10, -20, 0, 30, 40, 60, 10};
//   System.out.println((numArray[0] == 10 || numArray[numArray.length-1] == 10));	
//}
//}

//Q75
//public class JavaBasicExercises{
//	public static void main (String[] args){
//		int[] numArray = {50, -20, 0, 30, 40, 60, 10};
//		
//		System.out.println (numArray.length >= 2 && numArray[0] == numArray[numArray.length-1]);
//	}
//}


//Q76
//public class JavaBasicExercises{
//	public static void main (String[] args){
//		int[] numArray1 = {50, -20, 0, 30, 40, 60, 12};
//		int[] numArray2 = {45, 20, 10, 20, 30, 50, 11};
//		
//		System.out.println(numArray1[0] == numArray2[0] || numArray1[numArray1.length-1] == numArray2[numArray2.length -1]);
//	}
//}

//conditional statement Q16
//import java.util.Scanner;
//public class JavaBasicExercises {
//
//   public static void main(String[] args)
//
//{
//   int i,j,n;
//   System.out.print("Input number of rows : ");
// Scanner in = new Scanner(System.in);
//		    n = in.nextInt();
//
//   for(i=1;i<=n;i++)
//   {for(j=1;j<=i;j++)
//	  System.out.print(j);
//
//    System.out.println("");
//    }
//}
//}

