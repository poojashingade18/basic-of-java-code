package package1;

import java.util.Scanner;

public class Area_rectangle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the vale of l");
		
		Scanner p1=new Scanner(System.in);
		
		short l=     p1.nextShort();
		
		System.out.println("enter the value of b");
		
		short b=     p1.nextShort();
		
		int area= l*b;
		
		System.out.println("Area of rectanle" +" : "+ area);
		
		p1.close();

	}

}
