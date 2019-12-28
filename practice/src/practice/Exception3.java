package practice;

//Here try-catch in main method and exception in another method
public class Exception3 {

			public static void main(String[] args) {
			Exception3 e= new Exception3();
			try {	
			
			e.divide();
			}
			catch(ArithmeticException e1) {
				e1.printStackTrace();
			}
			
			System.out.println("hello");
		}		
	
		
		void divide() {
			int a = 100, b=0, c;
			c=a/b;
			//System.out.println(c);

	}

}
