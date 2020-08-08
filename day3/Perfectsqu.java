package day3;

public class Perfectsqu {

	public static void main(String[] args) {
		double a=100;
		double result=Math.sqrt(a);
		System.out.println(result);
		double output=Math.floor(result);
		System.out.println(output);
		if(result-Math.floor(result)==0){
			System.out.println("The given no is perfect squ");
		}
		else {
			System.out.println("The given no is not perfect squ");
		
		}

	}

}
