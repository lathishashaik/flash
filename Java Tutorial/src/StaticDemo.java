class Employee
{
	int emp_id;
	int salary;
	static String ceo;//ceo goes to class loader memory
	//static block is a spcl block in java to assign static var
	static //executes only once when class loads
	{
		ceo="Larry";
		System.out.println("In static block");
	}
	//constructor can be used to assign non-stat var
	public Employee()
	{
		emp_id=4;
		salary=2000;
		System.out.println("In Constructor");
	}
	public void show()
	{
		System.out.println(emp_id+ " "+salary+" "+ceo);
	}
}
public class StaticDemo {
//if we want certain var to not to be object specific we can make it static
	//it will be same for all objects irrespective of what obj we are using
	public static void main(String[] args) {
		Employee naveen=new Employee();
		naveen.emp_id=8;
		naveen.salary=4000;
		Employee.ceo="Nikhitha";//***to access static var we donot need obj
		
		Employee rahul=new Employee();
		rahul.emp_id=9;
		rahul.salary=5000;
		Employee.ceo="Nikhitha";//****
		
		Employee.ceo="Mahesh";//***the last assigned is fixed for all objs
		naveen.show();
		rahul.show();
		//using static block
		Employee ravi=new Employee();
		ravi.show();//***as larry runs 1st & mahesh last we are getting ceo mahesh
		//***otherwise larry will be ceo
	}

}
