import java.util.*;

//Q63
public class JavaBasicExerciseV2{

  String n = "hello";

  public static void main(String[] args){
    // System.out.println("Hello World!");
    Scanner in = new Scanner(System.in);
    System.out.println("input first number: ");
    int n1 = in.nextInt();
    System.out.println("input second number: ");
    int n2 = in.nextInt();

    String result = "Result: ";

    System.out.println(result + compareTwoValue(n1, n2));
  }

  public static int compareTwoValue(int n1, int n2){
    int r = 0;
    if (n1 == n2) {
      r = 0;
    }
    else if (n1 % 6 == n2 % 6) {
      if (n1 > n2) {
        r = n2;
      } else {
        r = n1;
      }
    }
    else {
      if (n1 > n2) {
        r = n1;
      } else {
        r = n2;
      }
    }
    return r;
  }
}
