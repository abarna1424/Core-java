package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		
			int num = 15;
			
			int rev = 0;
			int temp=num;
			while(num!=0) {
				int n = num%10;
				rev = (rev*10)+n;
				num /= 10;
			}
			//System.out.println();
			if(temp == rev) {
				System.out.println("PALINDROME");
			
			}
			else
			{
				System.out.println("NOT A PALINDROME");
			}
		
		  int a=3;
		  int b=2;
		  System.out.println("Power :"+Math.pow(a, b));
			
			

		}

	

}
