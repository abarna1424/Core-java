
public class Pattn3 {

	static void PrintT(int n) {
		int rowCount=1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("*");
			}
			for (int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+"");
			}
			
			System.out.print("");
		}
	}

	public static void main(String[] args) {
		int rowCount=1;
		for (int i = 1; i<n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("*");
			}
			for (int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+"");
			}
			
			System.out.print("");
		}
	}

	}

}

//int rowCount = 1;
//for (int i = n; i > 0; i--) {
//	for (int j = 1; j < i; j++) {
//		System.out.print(" ");//space
//	}
//
//	for (int j = 1; j <= rowCount; j++) {
//		System.out.print(rowCount + " ");
//	}
//
//	System.out.println();
//
//	rowCount++;
//}