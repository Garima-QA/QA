package practice;
//Polymorphism.

public class Call {

	void show(int a) {
		System.out.println("int method");
	}
	
	void show(String a) {
		System.out.println("String method");
	}
	public static void main(String[] args) {
		Call c= new Call();
		c.show('a');//Char automatically promoted to int type.

	}

}
