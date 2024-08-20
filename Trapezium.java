package package1;

import java.util.Scanner;

public class Trapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("please enter the value of a");
		
		Scanner s1=new Scanner(System.in);
		
		int a=      s1.nextInt();
		
		System.out.println("please enter the value of b");
		int b=      s1.nextInt();
		
		System.out.println("please enter the value of h");
		int h=      s1.nextInt();

		int trapeziem= 1/2*(a+b)*h;
		System.out.println(" Circumference of triangle" +" : "+ trapeziem);
		
		s1.close();

	}

}
