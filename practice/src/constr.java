

class constr {
	String s ="parent";
}

class constr1 extends constr{
	String s ="child";	
 public void m1() {
	 System.out.println(this.s);
	 System.out.println(super.s);
 }
}

class Test{
	public static void main(String[] args) {
	 constr1 c1= new constr1();
     c1.m1();
	}

}
