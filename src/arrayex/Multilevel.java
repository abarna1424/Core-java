package arrayex;

interface A{
	void msg();
	static void msga() {
		System.out.println("This is class A");
	}
}
//static void msga() {
//	System.out.println("This is class A");
//}
interface B{
	void msg();
	static void msga() {
		System.out.println("This is class b");
	}
}
class C implements A,B{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("This is class C");
		
	}
	
	}


public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.msg();
		A.msga();
		B.msga();

	}

}
