

public class Inst1 {
	Inst1(){
		this(10);
		System.out.println("0-arg constr");
	}
	
	Inst1(int a){
		System.out.println("1-arg constr");
	}
	
	{
		System.out.println("Instance blk");
	}

	public static void main(String[] args) {
		new Inst1();

	}

}
