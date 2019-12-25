package practice;

public class Polym {	
   void show(Object a) {
	   System.out.println("Object method");
   }
   
   void show(String a) {
	   System.out.println("String method");
   }
   
	public static void main(String[] args) {
		Polym p= new Polym();
		p.show("Hello");

	}

}
