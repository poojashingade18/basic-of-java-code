package package1;

public class Globalvariable {
	static int a= 6;
	int num= 12;
	

	public static void main(String[] args) {
		a=9;
		System.out.println(a);
		Globalvariable p1=new Globalvariable();
		p1.num=15;
		System.out.println(p1.num);

	}

}
