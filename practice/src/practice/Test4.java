package practice;
//Abstarct class with constructor

abstract class Test4 {
 Test4(){
	 System.out.println("Abstract class constructor");
 }
}

class Test3 extends Test4{
	Test3(){
		super();
		System.out.println("Normal class constrctr");
	}
	
	public static void main(String[] args) {
		new Test3();
	}
}
