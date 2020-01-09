package practice;

class UnderAgeException extends Exception{
	    UnderAgeException() {
		super("You are under age");
	}
	    UnderAgeException(String message){
	    	super(message);
	    }
	
}
   class Voting8 {

	public static void main(String[] args) {
		int age= 17;
		try {
		if(age<18) {
			throw new UnderAgeException();
		}

	}
       catch(UnderAgeException e) {
    	   e.printStackTrace();
       }
}}
