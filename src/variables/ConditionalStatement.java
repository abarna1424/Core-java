package variables;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
//		int a=213;
//		if(a%2==0) {
//			System.out.println(a +"Number is even");
//		}else {
//			System.out.println(a +"Number is odd");
//	}
//		
//		int Maths=99;
//		int Science=87;
//		int Social =97;
//		if (Maths>Science && Maths >Social ) {
//			System.out.println("He score high marks in Maths");
//		}else if(Science > Social && Science >Maths ) {
//			System.out.println("He score high marks in Science");
//		}
//		else {
//			System.out.println("Social marks is high compare to all other");
//		
//		}
		
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("First number:");
		int a=sc.nextInt();
		
		System.out.println("Second number");
		int b=sc.nextInt();
		
		System.out.println("Third number");
		int c=sc.nextInt();
		
		float percentage=(a+b+c)/3;
		System.out.println("Percentage :" + percentage);
		System.out.println("Average:");
		int avg;
		avg=sc.nextInt();
		System.out.println("Average :"+ avg);
		
		if (avg>=90 && avg <=89) {
			System.out.println("A+");
		}
		else if(avg>=80 && avg <=79) {
			System.out.println("A");
		}else if(avg>=70 && avg <=69) {
			System.out.println("A");
		}
		
		
		
		
		
		
//		
		
	}

}
