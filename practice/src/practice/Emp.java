package practice;
//Tightly encapsulated class

    class Emp {
    	private int eid; //data hidden here with private modifier.
    	private String ename;
    	
    	//setter method
    	public void setEid(int eid) {
    		this.eid= eid;
    	}
    	
    	public void setEname(String ename) {
    		this.ename= ename;
    	}
    	
    	//getter methods
    	public int getEid() {
    		return eid;
    	}
    	public String getEname() {
    		return ename;
    	}

	public static void main(String[] args) {
		Emp eb1= new Emp();
		eb1.setEid(111);        
        System.out.println(eb1.getEid());
        
        eb1.setEname("Dane");
        System.out.println(eb1.getEname());
	}

}
