

  class Parent2{
	  
  {
	System.out.println("parent class instance blk");
  }
  
  Parent2(){
	System.out.println("Parent class 0-arg contrct");  
  }
  
  static {
	System.out.println("Parent class static blk"); 
  }
  
  
  class Child3 extends Parent2{
	  {
		  System.out.println("Child class instance blk");//child instance blk
	  }
	  
	  Child3(){
		  System.out.println("Child class 0-arg contrct");//child constructor
	  }
	  
	  static {
			System.out.println("Child class static blk");// child static blk
		  }
		  
	  
  }
  
	public static void main(String[] args) {
		new Child3();
	}

}
