

public class Emp {
	int eid;
	String ename;
	float esal;
	
	Emp(int eid, String ename, float esal){
		 this.eid= eid;
		 this.ename= ename;
		 this.esal= esal;
	}
	
	void disp()
	{
		System.out.println("emp id=" +eid);
		System.out.println("emp ename=" +ename);
		System.out.println("emp esal=" +esal);
	}

	public static void main(String[] args) {
		Emp e1= new Emp(111, "Jade", 10000);
		e1.disp();
		Emp e2= new Emp(112, "Hary", 20000);
		e2.disp();
		

	}

}
