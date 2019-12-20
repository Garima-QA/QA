

public class New2 {
	//instance variables
	int a =10;
	int b = 20;
	//static variables
	static int c = 30;
	static int d= 40;
	
	void m1() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(New2.c);
		 System.out.println(New2.d);
		 
	}

	static void m2() {
		New2 n = new New2();		
		 System.out.println(n.a);
		 System.out.println(n.b);
		 System.out.println(New2.c);
		 System.out.println(New2.d);
		 
	}
	
	public static void main(String[] args) {
		New2 n = new New2();
		n.m1();
		New2.m2();

	}

}
