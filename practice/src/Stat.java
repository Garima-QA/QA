

//static blks

public class Stat {
	//Instance blk
	{
		System.out.println("instance blk");
	}
	//static blk.

	static {
		System.out.println("static blk");
	}
	
	Stat(){
		System.out.println("0-arg constr");
	}
	
	public static void main(String[] args) {
		new Stat();
		

	}

}
