package package1;

import java.util.Scanner;

public class Areatriangle {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the valu of b");
		Scanner s1=new Scanner(System.in);
		int b=   s1.nextInt();
		
		System.out.println("please enter value of h");
		int h=    s1.nextInt();
		int area=(b*h)/2;
		System.out.println("Area of Triangle" + ":" + area);
		  s1.close();

	}

}
