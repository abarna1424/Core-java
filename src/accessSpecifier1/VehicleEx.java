package accessSpecifier1;

import accessspecifier.Vehicle1;
class Bike extends Vehicle1{
	
	 int speed;
	protected Bike(String n,int s) {
		super(n);
		speed=s;
	}
	 void dis() {
		vehicle();
		System.out.println("Value of bike :"+speed);
	 }	
}

public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike("Jupiter", 2400);
		b.dis();
//		Vehicle1 v=new Vehicle1(100);//we can not access protected constructor in another package non sub class
		
	}

}
