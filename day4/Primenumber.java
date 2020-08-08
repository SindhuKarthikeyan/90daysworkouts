package day4;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int num;
		System.out.println("Enter the number upto print the prime no:");
		num=in.nextInt();
		int rem;
		for (int i = 0; i < num; i++) {
			
			//System.out.println(i);
		rem=i%2;
		
		if(rem!=0) {
			System.out.println("prime no:"+i);
		}
		else {
			System.out.println("not prime no:"+i);
		}
			
		

	}
	}
}

 
