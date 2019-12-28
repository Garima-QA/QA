package practice;
//Customized unchecked exception using throw keyword.

class YoungAgeException extends RuntimeException {
	
	YoungAgeException( String msg){
	   super(msg);
	    }
}

class Voting{
	
	public static void main(String[] args) {
		int age= 16;
		
		if(age<18) {
			throw new YoungAgeException("You are not eligible to vote");
		} else {
			System.out.println("Please vote");
		}

	}

}
