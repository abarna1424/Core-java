package arrayex;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	int a[] = {3,4,2,5,6};
//		Arrays.sort(a);
//		System.out.println("My Array :"+ Arrays.toString(a));
//		
//		String str[]= {"abarna","varathan","Dharini","Janani"};
//		Arrays.sort(str);
//		System.out.println("My String :" + Arrays.toString(str));
//		

		System.out.println("My sorted Arrays :");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				 if (a[i] > a[j]) {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			}
			
		}
			System.out.println(a[i]);
		}
		
//	
	}

}
