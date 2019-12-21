
package practice;

//Abstraction.

 abstract class Test {
 abstract void m1();
 abstract void m2();
 }

abstract class Test1 extends Test{
	void m1() {
		System.out.println("m1 method");
	}
}
	
class Test2 extends Test1{
		void m2() {
			System.out.println("m2 method");
		}

	public static void main(String[] args) {
		Test4 t= new Test4();
		t.m1();
		t.m2();

	}

}
