package inheritance;
//When parent class method and child class method name and variablename is same
class Vehicle{
	int speed=100;
	void vspeed() {
		int speed=100;
		System.out.println("Speed of the vehicle :"+ speed);
	}
}
class Car extends Vehicle{
	int speed=200;
	void display() {
		super.vspeed();
		System.out.println("Speed of the vehicle :"+ super.speed);

		System.out.println("Speed of the car :"+ speed);
	}
	}
	


public class Superasvariable {

	public static void main(String[] args) {
		
		Car c= new Car();
		c.display();

	}

}

//class Animal{
//	String type;
//	public Animal() {
//		System.out.println("Parent Default constructor");
//	}
//	public Animal(String type) {
//		this.type=type;
//		System.out.println(this.type);
//	}
//}
//class Tiger extends Animal{
//	String color;
//	public Tiger() {
//		super();//super call parent class default constructor
//		System.out.println("Child Default constructor");
//	}
//	public Tiger(String type,String color) {
//		super(type);
//		this.color=color;
//		System.out.println(this.color);
//		
//	}
//}
//public class SuperAsConstructor {
//	public static void main(String[] args) {
//		//Tiger t=new Tiger();
//		Tiger t1=new Tiger("Wild","ORange");
//	}
//
//}