
public class Pattn2 {
	
	void PrintT(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			System.out.print("");
		//	System.out.println(j+"");
			
		}
			System.out.print("*");
		}
	}
	

	public static void main(String[] args) {
		
          Pattn2 p=new Pattn2();
          p.PrintT(2);
          p.PrintT(1);
          p.PrintT(0);
          
	}

}
