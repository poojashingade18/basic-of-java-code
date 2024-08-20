package package1;

public class Localglobal {
	 final static int c=3;
	static int a=4;
	 double d=6.5;
	 static int add=c+a;
	 
	  void add ()
	 {
		 int p=20;
		 int q=2;
		 int add=p=q;
		 System.out.println(add);
	 }
	 static void sub()
	 {
		double b=4;
		double e=5;
		double sub=b-e;
		System.out.println(sub);
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add);
		Localglobal v1= new Localglobal();
		System.out.println(v1.d);
		v1.add();
		sub();

				
				
				
		
		

	}

}
