package package1;

import java.util.Scanner;

public class Circunfterance_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("please enter the value of a");
		
		Scanner s1=new Scanner(System.in);
		
		int a=      s1.nextInt();
		
		System.out.println("please enter the value of b");
		int b=      s1.nextInt();
		
		
		int Circumferancerectangle= 2*(a+b);
		System.out.println(" Circumference of triangle" +" : "+ Circumferancerectangle);
		
		s1.close();

	}

}
