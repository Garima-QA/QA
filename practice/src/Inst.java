

public class Inst {
	Inst(){
		System.out.println("0-arg constr");
	}

	Inst(int a){
		System.out.println("1-arg constr");
	}

	Inst(int a, int b){
		System.out.println("2-arg constr");
	}
	
	//Instance block
	{
		System.out.println("Instance block");
	}

	
	public static void main(String[] args) {
		new Inst();
		new Inst(10);
		new Inst(10, 20);

	}

}
