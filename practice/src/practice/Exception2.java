package practice;

//hERE TRY-CATCH DEFINED WITH EXCEPTION
public class Exception2 {

	public static void main(String[] args) {
		
			Exception2 e= new Exception2();
			e.divide();
			System.out.println("I am main method");

		}
		void divide() {
			
			try {
			int a = 100, b=0, c;
			c=a/b;
			System.out.println(c);
			}
			
			catch(ArithmeticException e) {
				e.printStackTrace();
			}

	}

}
