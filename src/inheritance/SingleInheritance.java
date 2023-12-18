package inheritance;

class Father{
	String fname="Abarna";
}
class Daughter extends Father{
	String dname="Govind";
	void display() {
		System.out.println("Fathers Name :"+fname);
		System.out.println("Fathers Name :"+dname);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Single Inheritance :");
        Daughter d=new Daughter();
        d.display();
        d.fname="Varathan";
        d.dname="Dharshika";
	}

}
