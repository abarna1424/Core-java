package variables;

import java.util.Scanner;

public class Additionoperator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		
		System.out.println("First Number:");
		int num1=sc.nextInt();
		System.out.println("Second Number:");
		int num2=sc.nextInt();
		System.out.println("Choose the operator: + - * /");
		char ch=sc.next().charAt(0);
		System.out.println("Operation:"+ ch);
	//	int Result;System.out.println("Operation:"+ ch);
		switch(ch) {
		case '+':{
	      //  Result = number1 + number2;
	        System.out.println("Addition:" + (num1+num2));
	        break;
		}
		case '-':{
	       // Result = number1-number2;
			 System.out.println("Subtraction:" + (num1-num2));
	        break;
		}
		case '*':{
	     //   Result = number1 * number2;
	        System.out.println("Multiplication:" + (num1*num2));
	        break;
		}
		case '/':{
	      //  Result = number1 / number2;
	        System.out.println("Division:" + (num1/num2));
	        break;
		}
		default:{
			System.out.println("You entered wrong operation");
			break;
		}
		
	}
	}

}
