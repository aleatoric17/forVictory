import java.util.*;

//Q63
public class JavaBasicExerciseV1{
  public static void main(String[] args){
    // System.out.println("Hello World!");
    Scanner in = new Scanner(System.in);
    System.out.println("input first number: ");
    int n1 = in.nextInt();
    System.out.println("input second number: ");
    int n2 = in.nextInt();

    System.out.println("the 2 numbers are: " + n1 + " , " + n2);

    if ( n1 > n2 ){
      System.out.println("The larger number is: " + n1);
    }
    if ( n1 < n2 ){
      System.out.println("The larger number is: " + n2);
    }

    if ( n1 == n2 ){
      System.out.println("The two numbers are equal as result shows: 0");
    }

    if ( (n1 % 6 == n2 % 6) && (n1 > n2) ){
      System.out.println("The two numbers have the same remainder by 6, and the smaller number is: " + n2);
    }

    if ( (n1 % 6 == n2 % 6) && (n1 < n2) ){
      System.out.println("The two numbers have the same remainder by 6, and the smaller number is: " + n1);
    }

  }
}
