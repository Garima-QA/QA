

//Passing object as an argument.

public class New5 {

	int a =5;
	
	void changeObjectValue(New5 o) {
		o.a++;
	}
	
	public static void main(String[] args) {
		New5 ob= new New5();
		System.out.println(+ob.a);
		ob.changeObjectValue(ob);
		System.out.println(+ob.a);

	}

}
