package package1;

import java.util.Scanner;

public class Circumference_circle {
	
	final static double pi= 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the value of r");
		
		Scanner s1=new Scanner(System.in);
		
		double r=    s1.nextDouble();
		
		double Circumferencecircle= 2*pi*r;
		
		System.out.println("Area of Circumference of circle" +" : "+ Circumferencecircle);
		
		s1.close();
		
	

	}

}
