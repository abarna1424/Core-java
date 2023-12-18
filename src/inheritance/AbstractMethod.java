package inheritance;
abstract class Fruits{
	abstract void display();  // method signature =>Method without body
	void vfruits() {
		System.out.println("Orange");
	}
}
 class Mango extends Fruits{
	  String str="Apple";
	void display() {
		System.out.println("Abstract Method :"+ str);
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mango m=new Mango();
//		m.display();
		
		Mango m=new Mango();
	    Fruits FriRef; //Reference
	    FriRef=m;
	    FriRef.display();
		
		Fruits f=new Mango(); //Upcasting
		f.display();
		f.vfruits();

	}

}
