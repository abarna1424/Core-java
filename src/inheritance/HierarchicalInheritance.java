package inheritance;

class Emp{ 
	int sal=0;//parent one
	void CompanyName() {  //fun
	System.out.println("Accenture");
}
	}
class PermanentEmp extends Emp{  //child1
     int sal,hra,da,ta;
   
	public void PermanentEmp (int sal) {
    	 hra=5000;
    	 da=450;
    	 ta=24333;
    	 this.sal=sal;
	}	
    public void p_salary() {
    	
    	return ;
     }
}    

class Temporaray extends Emp{
	public Temporaray (int fsal) {
		this.sal=fsal;
	}
	public void t_salary() {
		System.out.println("Salary of Temporary Employee :"+sal);
	}
}
class Contract extends Emp{
	public Contract (int csal) {
		this.sal=csal;
	}
	public void c_salary() {
		System.out.println("Salary of Contract Employee :"+sal);
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp c=new Emp();
		System.out.println("Company Name :");
		c.CompanyName();
		System.out.println("Salary Structure of Employees");
		PermanentEmp p=new PermanentEmp();
		 System.out.println("Salary of  Parmanent Employee :"+p.sal);
		Temporaray t=new Temporaray(2400);
		t.t_salary();
		Contract c1=new Contract(1400);
		c1.c_salary();
		

	}

}