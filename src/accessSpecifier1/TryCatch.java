package accessSpecifier1;

import java.awt.font.NumericShaper;

public class TryCatch {
	
	public static void main(String[] args) {
	try {
		int a[]= {2,3,4,5,6};
		System.out.println("Array Elements :"+a[2]);
		int c=20/4;
		System.out.println("Element C :"+c);
//		String s="abc";  //abc can not convert into number
//		int ss=Integer.parseInt(s);
//		System.out.println("Integer Value :"+ss);
//		int b[]=null;
//		System.out.println("Length of the array :"+b.length);
		String str="";
		System.out.println("Value of the string :"+str.length());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(ArithmeticException e1) {
		System.out.println(e1);
	}
	catch(NumberFormatException e2) {
		System.out.println(e2);
	}
	catch(NullPointerException e2) {
		System.out.println(e2);
	}
	
	finally {
		System.out.println("Finally Block");
		
	}
}
	
}

//try {
//	//code
//	int a[]= {2,3,4};
//	System.out.println("Array Element:"+a[2]);
//	int c=20/0;
//	System.out.println("Element C:"+c);			
//}
//catch(ArrayIndexOutOfBoundsException e) {
//	System.out.println(e);
//}
//catch(ArithmeticException e1) {
//	System.out.println(e1);
//}
//finally {
//	System.out.println("Finally Block");
//}
