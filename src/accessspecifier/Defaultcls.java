package accessspecifier;
class Default{
	int a;
	Default(int a) {
		this.a=a;
	}
	public void display() {
		System.out.println("Value of a :"+this.a);
	}
}
class Def extends Default{
	int b;
	Def(int a,int b) {
		super(a);
		this.b=b+a;
	}
	public void display1() {
//		 display();
		System.out.println("Value of b :"+this.b);
	}
}
public class Defaultcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Default d=new Default(24);
       d.display();
       Def dd=new Def(24,14);
       dd.display1();
	}

}




//package accessspecifier;
//class Defaultcls{
//	int a;
//	Defaultcls(int a) {
//		this.a=a;
//	}
//	void display() {
//		System.out.println("Value of a:"+a);
//	}
//	
//}
//class DefaultSub extends Defaultcls{
//	int b;
//	DefaultSub(int a,int b) {
//		super(a);//default class parent constructor
//		this.b=b;	
//	}
//	void defSubMethod() {
//		display();//default class default method
//		System.out.println("Value of b:"+this.b);
//	}
//	
//}
//public class DefaultClass {
//
//	public static void main(String[] args) {
//		Defaultcls dc=new Defaultcls(20);//non sub class
//		dc.display();
//		System.out.println("*************Sub class**********");
//		DefaultSub ds=new DefaultSub(12,23);
//		ds.defSubMethod();
//
//	}
//
//}