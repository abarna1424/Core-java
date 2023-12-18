package accessspecifier;
public class PrivateClass  {
	private int a;
	private PrivateClass(int a) {
		this.a=a;
	}              //private class,private variable in public class
	private void display() {
		System.out.println("Value of a:"+a);
	}
	public static void main(String[] args) {
		PrivateClass p=new PrivateClass(10);
		System.out.println("Value of a : "+p.a);
		p.display();
}
}