package package1;

public class Ifelseif3 {

	public static void main(String[] args) {
		char gender;
		char gender2;
		gender= 'F';
		gender2='m';
		int age= 13;
	
		if(gender=='F')
		{
			System.out.println("travelling is free");
		}
		if(age<=12 )
		{
			System.out.println("ticket is half");
		}
		 if(age>=13 && age<=59)
		{
			System.out.println("ticket is full");
		}
		 if(age>=60)
		{
			System.out.println("citizen ticket");
		}
	
		

	}

}
