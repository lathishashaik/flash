//final keyword can be used with var,methods,class
//no other cls can extend final cls
//no other cls can override final method
class A11
{
	final int DAY;//here DAY becomes constant
	public A11() {
		DAY=10;//once assigned
		//DAY=19;Error
	}
	public final void show() {
		System.out.println("In A11");
	}
}
class B11 extends A11{
	/*public void show() {
		System.out.println("In B11");
	}*///Error cannot override
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11 obj=new A11();
		System.out.println(obj.DAY);
		obj.show();

	}

}
