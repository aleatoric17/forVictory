package forVictory;

import java.util.Scanner;

public class Basic32CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("input first number: ");
		int n1 = in.nextInt();
		System.out.print("input second number: ");
		int n2 = in.nextInt();
		
		if (n1 != n2) {
			System.out.println( n1 + " != " + n2);
		} 
		
		if (n1 == n2) {
			System.out.println( n1 + " = " + n2);
		}
		
		if (n1 < n2) {
			System.out.println( n1 + " < " + n2);
		}
			
		if (n1 > n2) {
			System.out.println( n1 + " > " + n2);
		}
		
		if (n1 <= n2) {
			System.out.println( n1 + " <= " + n2);
		} 
		if (n1 >= n2) {
			System.out.println (n1 + " >= " + n2);
		}
		
		
	}

}
