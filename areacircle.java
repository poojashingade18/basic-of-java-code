package package1;

import java.util.Scanner;

public class areacircle {
	
	static double pi = 3.14;

	public static void main(String[] args) {
		// Assignment 17 Accept number from user and calculate Area of circle (formula πr square, PI=3.14) 
		
		System.out.println("please enter the valu of r");
		Scanner s1=new Scanner(System.in);
		double r=   s1.nextDouble();
		double area= pi*r*r;
		System.out.println("Area of circle" + ":" + area);
		  s1.close();

	}

}
