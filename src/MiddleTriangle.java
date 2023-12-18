         import java.util.Scanner;
class MiddleTriangle{
	static void printPattern(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.println("");
			}
			for(j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}
     public class MiddleTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Middle Triangle :");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		MiddleTriangle.printPattern(num1);
		MiddleTriangle.printPattern(num2);
		MiddleTriangle.printPattern(num3);
		
		

	}

}
