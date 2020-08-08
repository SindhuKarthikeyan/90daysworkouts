package day3;

public class PerformArithmeticOperation {

	public static void main(String[] args) {
		MethodOverloading add= new MethodOverloading();
		add.addition(4,5);
		add.sub(10, 5);
		add.multiplication(50, 50);
		add.division(50, 10);
		add.modulous(50, 20);
	}
	
	

}


class MethodOverloading{
	public static void addition(int a,int b) {
		System.out.println("The result:"+""+(a+b));
		
	}
	public static void sub(int a,int b) {
		System.out.println("The result:"+""+(a-b));
		
	}
	public static void multiplication(int a,int b) {
		System.out.println("The result:"+""+(a*b));
		
	}
	public static void division(int a,int b) {
		System.out.println("The result:"+""+(a/b));
		
	}
	public static void modulous(int a,int b) {
		System.out.println("The result:"+""+(a%b));
		
	}

}
