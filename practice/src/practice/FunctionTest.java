package practice;
//New Java8 feature Functions

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println("The square of 40:" +f.apply(40));
		System.out.println("The square of 50:" +f.apply(50));
 	}

}
