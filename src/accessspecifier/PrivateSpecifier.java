package accessspecifier;

public class PrivateSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package accessspecifiers;
		class PrivateDemo{
			private int a=11;
			String name = "Preetha Selvan";
			private int num;
			
			public int getNum() {
				return num;
			}

			public void setNum(int num) {
				this.num = num;
			}

			void displayA() {
				System.out.println("A: "+a);
			}
		}

		public class PrivateEX1 {

			public static void main(String[] args) {
				PrivateDemo demo = new PrivateDemo();
				System.out.println(demo.name);
				demo.displayA();
				demo.setNum(16);
				System.out.println("Get Number: "+demo.getNum());
			}

		}

	}

}




//class Student1{
//	int eno;
//	String name;
//	//No return even void-->not static
//   Student1(){
//		eno=1;
//		name="Priya";
//		System.out.println("Default Constructor");
//		System.out.println("Eno : "+eno+ "  NAme : "+name);
//	}
//	Student1(int eno,String nm){
//		this.eno=eno;
//		name=nm;
//		System.out.println("Parameterized Constructor");
//		System.out.println("Eno : "+this.eno+ "  NAme : "+name);
//	}
//}
//public class ConstructorEx {
//
//	public static void main(String[] args) {
//		Student1 s=new Student1();
//		System.out.println("********************");
//		Student1 s1=new Student1(13, "Raj");
//
//	}
//
//}
