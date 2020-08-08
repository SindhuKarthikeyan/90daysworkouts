package day2;

import java.util.Scanner;

public class floydtriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		       int row, num= 1, i, j;
		      
		       Scanner sc = new Scanner(System.in);
		       System.out.println("Enter the number of rows for floyd's triangle:");
		      
		       row = sc.nextInt();
		       System.out.println("Floyd triangle");
		      
		       for ( i = 1 ; i <= row ; i++ )
		       {
		           for ( j = 1 ; j <=i ; j++ )
		           {
		                System.out.print(num+" ");
		                
		                num++;
		           }
		           
		           System.out.println();
		       }
		   }
		}
		

