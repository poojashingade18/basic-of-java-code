package package1;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("press 1 for chrome browser");
		System.out.println("press 2 for firefox browser");
		System.out.println("press 3 for edge browser");
		
		int browser_selection=s1.nextInt();
		switch (browser_selection)
		{
		case 1: System.out.println("launch chrome browser");
		break;
		case 2: System.out.println("launch firefox browser");
		break;
		case 3:System.out.println("launch edge browser");
		break;
		default:System.out.println("sorry your selection is wrong");
		}
	

	}

}
