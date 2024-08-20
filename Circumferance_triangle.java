package package1;

import java.util.Scanner;

public class Circumferance_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the value of a");
		
		Scanner s1=new Scanner(System.in);
		
		int a=      s1.nextInt();
		
		System.out.println("please enter the value of b");
		int b=      s1.nextInt();
		
		System.out.println("please enter the value of c");
		int c=      s1.nextInt();

		int Circumferancetriangle= a+b+c;
		System.out.println(" Circumference of triangle" +" : "+ Circumferancetriangle);
		
		s1.close();
	}

}
