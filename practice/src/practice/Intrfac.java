package practice;
//Interface.


interface Intrfac {
 void show();
 }
class Tree implements Intrfac{
	public void show() {
		System.out.println("Hello");
	}
public static void main(String[] args) {
	Tree t= new Tree();
	t.show();
}
	
}