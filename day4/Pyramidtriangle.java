package day4;

import java.util.Scanner;

public class Pyramidtriangle {

		public static void main(String[] args) {
			
			Scanner obj= new Scanner(System.in);
		
				  int row;
				  System.out.println("Enter the no.of Rows:");
				  row=obj.nextInt();
			      pyramidstar(row);
					
				}

public static void pyramidstar(int row) {
	
	for (int i = 0; i <row; i++) {
				
		for (int j = row-i; j>1; j--) {
					 
			System.out.print("");
			
		 }
		
		 for (int j=0; j<=i; j++ )  { 
			 
		   System.out.print("* ");
			        }
		   System.out.println();
		   
		}
	}
			
}
	

				  
			  	


