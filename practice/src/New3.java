

//Passing New2 class object as an argument in a method.

class New2{}

public class New3 {
	
	void m1(New2 n1) {
		System.out.println("m1 method");
	}
		

	public static void main(String[] args) {
		New3 n= new New3();
		
		New2 x= new New2();// New2 class object created.
		n.m1(x);	
		

	}

}
