package accessspecifier;

class PerformAddition{
	static int  add(int a,int b) {
		return (a+b);
	}
	static float add(float a,int b) {
		return (a+b);
	}
	static double add(double a,int b) {
		return (a+b);
	}
}




public class MethodOverloading {

	public static void main(String[] args) {
	     System.out.println("Function with both integer parameter :"+PerformAddition.add(10,20));
	     System.out.println("Function with one float and one integer parameter :"+PerformAddition.add(20f,10));
	     System.out.println("Function with one double and one integer parameter :"+PerformAddition.add(24,14));
	}

}
