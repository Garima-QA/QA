package practice;

interface Intrfac1 {
 void show();
}
interface Intrfac2{
	void display();
}

class Tree1 implements Intrfac1, Intrfac2{
	public void show() {
		System.out.println("Hello");
	}
	
	
	public void display() {
		System.out.println("Hello1");
	}
	
	public static void main(String[] args) {
		Tree1 t2= new Tree1();
		t2.show();
		t2.display();
	}
	
	
}