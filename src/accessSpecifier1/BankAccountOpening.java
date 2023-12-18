package accessSpecifier1;

class ExceptionBank extends Exception{
	public ExceptionBank(String msg) {
		super(msg);
	}
}

public class BankAccountOpening {
    String invalidAge(int age) throws ExceptionBank{
    	if(age<15) {
    		System.out.println("Age is smaller than 15");
    	}else {
    		return "Valid";
    	}
		return null;
	
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountOpening b=new BankAccountOpening();
		try {
			System.out.println(b.invalidAge(3));
		}
		catch(ExceptionBank e){
			System.out.println(e);
			
		}

	}

}



//class ExceptionMovie extends Exception{
//	public ExceptionMovie(String msg) {
//		super(msg);
//	}
//}
//public class MovieException {
//	String invalidAge(int age) throws ExceptionMovie {
//		if(age<18) {
//			throw new ExceptionMovie("Age is smaller than 18");
//		}
//		else {
//			return "Valid ";
//		}
//	}
//	public static void main(String[] args) {
//		MovieException m=new MovieException();
//		try {
//			System.out.println(m.invalidAge(-22));
//		} catch (ExceptionMovie e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//
//	}
//
//}