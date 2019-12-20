

public class Stat2 {
	 static {
		 System.out.println("static blk A");
	 }

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Stat3");

	}

}
