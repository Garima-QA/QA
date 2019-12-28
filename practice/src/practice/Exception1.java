package practice;

//exception handled by default exception handler.

public class Exception1 {

	public static void main(String[] args) {
		Exception1 e= new Exception1();
		e.divide();
		System.out.println("I am main method");

	}
	void divide() {
		int a = 100, b=0, c;
		c=a/b;
		System.out.println(c);
	}

}
