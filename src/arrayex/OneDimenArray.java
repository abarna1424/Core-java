package arrayex;

import java.util.Scanner;

public class OneDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array  :");
		int size=sc.nextInt();
		System.out.println("Enter the Elements: ");
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("The Array Elements are :");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+"");
		}

	}

}
