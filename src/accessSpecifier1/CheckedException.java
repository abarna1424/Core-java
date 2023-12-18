package accessSpecifier1;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("accessSpecifier1.CheckedException");
			System.out.println("Class  found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found"+e);
		}

	}

}


//public class CheckedException {
//
//	 
//
//	public static void main(String[] args) {
//
//	
//
//			try {
//
//				Class.forName("basic.Demo");
//
//				//File f=new File("demo123.txt");
//
//				System.out.println("Class found");
//
//			} 
//          catch (ClassNotFoundException e) {
//
//				
//
//				System.out.println("Class  not found"+e);
//
//			}






//File f = new File("f:/filepooja11.txt");
//
//if(!f.exists()){
//
//throw new Exception("File doesnot exist "+f.toString());
//
//}
//
//else {
//
//System.out.println("Welcome, we got into file "+f.toString());
//
//}