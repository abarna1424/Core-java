package accessspecifier;

public class MethodOverloadingEx {
       void shape(int l,int b) {
    	   System.out.println("Reactangle area :"+(l*b));
       }
       void shape(double l,double b) {
    	   System.out.println("Reactangle area :"+(l*b));
       }
       void shape(float l,int b) {
    	   System.out.println("Reactangle area :"+(l*b));
       }
	public static void main(String[] args) {
		
		MethodOverloadingEx mo= new MethodOverloadingEx();
		mo.shape(24,14 );
		mo.shape(4, 2);;
		mo.shape(1, 4);;

	}

}
