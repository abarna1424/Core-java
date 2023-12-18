package inheritance;

abstract class Shapes{
	double d1;
	double d2;
	 Shapes(double a,double b) {
		d1=a;d2=b;
	}
	 abstract double area();
}
class Reactangle extends Shapes{
	Reactangle(double a ,double b){
       super(a,b); 
	}

	@Override
	double area() {
		System.out.println("Reactangle shape.");
		return d1*d2;
	}
	
}
class Triangle extends Shapes{
	Triangle(double a,double b){
		super(a,b);
	}

	@Override
	double area() {
		System.out.println("Triangle shape.");
		return d1*d2/2;
	}
	
}
public class AbstractAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Triangle t= new Triangle(24,14);
         Reactangle r=new Reactangle(10,20);
         Shapes FigRef; //Reference
         FigRef=t;
         FigRef.area();
         System.out.println("Area is " + FigRef.area());
        System.out.println("Area using Triangle object " + t.area());
        FigRef=r;
        System.out.println("Area is " + FigRef.area());
        
        
	}

}






//class Parent1{
////	final void display() {
////		System.out.println("PAren class final method");
////	}
//}
//public class FinalEx extends Parent1{//we declare any class final we can not extend
//	final int a=10;//we can not change value
//		void display() {//we can not override final method
//		
//		}
//		
//	public static void main(String[] args) {
//		FinalEx f=new FinalEx();
//		f.a=15;
//
//	}
//
//}
