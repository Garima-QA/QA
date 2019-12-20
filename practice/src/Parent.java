

public class Parent {
	int a = 10;
	int b= 20;
}
class Child extends Parent{
	int a = 100;
	int b = 200;
	
	void add(int a, int  b) {
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);	
		
	}
	
public static void main(String[] args) {
		new Child().add(1000, 2000);

	}

}
