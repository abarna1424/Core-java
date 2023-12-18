package variables;

public class Switchcase {

	public static void main(String[] args) {
		int Grade = 4;
		switch (Grade) {
		case 11: {
			System.out.println("Your Grade is A+");
			break;
		}
		case 12: {
			System.out.println("Your Grade is A");
			break;
		}
		case 13: {
			System.out.println("Your Grade is B+");
			break;
		}
		case 14: {
			System.out.println("Your Grade is B");
			break;
		}
		case 15: {
			System.out.println("Your Grade is C+");
			break;
		}
		case 24: {
			System.out.println("Your Grade is C");
			break;
		}
		default:{
			System.out.println("You entered wrong operation");
			break;
		}

		}
	}

}
