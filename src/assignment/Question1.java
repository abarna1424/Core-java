///* class definitions:
// class MyException: Define exception
// class Source:
// method definitons:
// checkName(String firstName,String lastName)throw a user defined
//exception if firstName and lastName is blank else return name
// return type: String
// visibility: public
// 
// * checkName(String firstName,String lastName): throw a user defined exception if
//firstName and lastName is blank else return name*/
package assignment;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}

public class Question1 {
	public String checkName(String firstName,String lastName)throws MyException{
		if(firstName.isEmpty()) {
			throw new MyException("firstname is empty");
		}else if(lastName.isEmpty()) {
			throw new MyException("lastname is empty");
		}else {
			return firstName+lastName;
		}
	}
	

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name :");
		String firstName=sc.nextLine();
		System.out.println("Enter the Second Name :");
		String lastName=sc.nextLine();
		Question1 q=new Question1();
		try {
			System.out.println(q.checkName(firstName, lastName));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}





