class Calculator
{ 
	int num1;
	int num2;
	int result;
	public Calculator()
	{
		num1=5;
		num2=5;
		System.out.println("In Constructor");
	}
	public Calculator(double n,int l)
	{
		num1=(int)n;
		num2=l;
		System.out.println("Constructor overloading");
	}
	//this keyword-differentiating inst & local var
	public Calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("this keyword");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Calculator obj=new Calculator(7.5,6);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        //this
        Calculator obj1=new Calculator(1,2);
        System.out.println(obj1.num1);
        System.out.println(obj1.num2);
	}

}
