package day4;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		//Get the Input from user
		Scanner myObj = new Scanner(System.in);
	    int num;
	    System.out.println("Enter the year:"); 
	    num = myObj.nextInt();   
	    int quo=num%4;
	    //Check the given year is leap year
		if(quo==0) 
			System.out.println("The given number is leap year");
		else
			System.out.println("The given number is not leap year");
		
		

	}

}
