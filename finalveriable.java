package package1;

public class finalveriable {
	final static int c=5;             //static
	static int a=4;
	static int add=c+a;
	
	 final double d=6.5;             //non static
	 double z= 5.0;
	 double addition= d+z;
	
	 static void sub()               // static
	
	 {
		final double b=4.0;
		double e=5.0;
		double sub=b-e;
		System.out.println(sub);
	 }
	 
	 void add ()                         //non static
	 {
		 final int p=20;
		 int q=2;
		 int add=p+q;
		 System.out.println(add);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add);
		sub();
		finalveriable k1=new finalveriable();
		System.out.println(k1.addition);
		System.out.println(k1.add);

	}

}
