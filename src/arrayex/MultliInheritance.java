package arrayex;
interface ABC{
	void msg();
	static void abc() {
		System.out.println("This is ABC class");
	}
}
interface XYZ{
	void msg1();
	static void xyz() {
		System.out.println("This is ABC class");
	}
}
interface PQR extends ABC,XYZ{
	void msg2();
	static void pqr() {
		System.out.println("This is combination of ABC and XYZ class");
	}
}
class SS implements ABC,XYZ{
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("This is first ABC class");
	}

	@Override
	public void msg1() {
		// TODO Auto-generated method stub
		
		System.out.println("This is second XYZ class");
	}
	
	}
	
	

public class MultliInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS s=new SS();
		s.msg();
		s.msg1();
		PQR.pqr();
		
		

	}

}
