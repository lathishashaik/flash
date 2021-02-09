//task is to create calculator
class Calc
{ 
	int num1;
	int num2;
	int result;
	public void perform() 
	{
		result=num1+num2;
	}
}
public class ObjectDemo {
    //object knows sthg (data) & does sthg (with the help of methods)
	public static void main(String[] args) {
		/*Calc obj;// obj is reference for calc
		obj=new Calc();//new is responsible to allocate memory
		*/
		Calc obj=new Calc();
		obj.num1=3;
		obj.num2=5;
		obj.perform();
		System.out.println(obj.result);
	}

}
