class StringMethod{
	static int div(int a,int b) {
		return (a/b);
	}
}
public class FunctionDemo {
  //Function without return but with parameters
	
	 int a=3,b=4;
     void add() {
     	System.out.println("Add:"+a+b);
     }
     int no1,no2;
     void addition(int n1,int n2){
    	 System.out.println( "Addition :"+n1+n2);
     }
     
     //Function with return type
     int adds() {
    	 return(a+b);
     }
     int Mul(int a1,int a2) {
    	 return(a*b);
     }
     
     static String display() {
    	 return("Hello varathan");
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FunctionDemo demo=new FunctionDemo();
       demo.add();
       demo.addition(3,4);
       System.out.println("Addition using return :"+demo.adds());
       System.out.println("Miultiplication :"+demo.Mul(14,24));
       System.out.println("String Display :"+display());
       System.out.println("String method of another class:"+ StringMethod.div(12,4));
       
	}

}



//public int countAm(String s) {
//	String str = s.toLowerCase();
////	System.out.println("str :"+str);
//	int cnt = 0;
//	String a[] = str.split(" ");
//	for (int i = 0; i < a.length; i++) {
//		if (a[i].equals("am")) {
//			cnt = cnt + 1;
//		}
//		//System.out.println(i+"--"+a[i]);
//	
//	}
//	return cnt;
//}
