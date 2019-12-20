

public class Parent1 {
	
}

class Child1 extends Parent1{
	Child1(){
		super();
		System.out.println("Child1 class 0-arg constr");
	}

	public static void main(String[] args) {
		new Child1();
	}

}
