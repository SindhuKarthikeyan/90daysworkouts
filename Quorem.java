package day1;

import java.util.Scanner;

public class Quorem {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of the first number ::");
	      double a = sc.nextDouble();
	      System.out.println("Enter the value of the Second number ::");
	      double b = sc.nextDouble();
	      double quo = a/b;
	      double rem = a%b;
	      System.out.println("The Quotient is: "+quo);
	      System.out.println("The Remainder is:"+rem);
		

	}

}
