package day2;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int i;
		Random ran=new Random();
		System.out.println("Random No:");
		for (i = 1; i < 10; i++) {
			System.out.println(ran.nextInt(10));
			System.out.println(ran.nextFloat());
			System.out.println(ran.nextDouble());
			System.out.println(ran.nextBoolean());
			System.out.println(ran.nextLong());
			
		
		}
		

	}

}
