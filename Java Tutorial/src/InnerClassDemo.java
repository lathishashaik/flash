class Outer
{
	int a;// member var
	public void show() //member method
	{
		System.out.println("In show");
	}
	class Inner//member class //**Outer$Inner.class
	{
		public void display() {
			System.out.println("In display");
		}
		
	}
}
public class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		Outer obj=new Outer();
		obj.show();
//*****to access inner cls
//******Inorder to use inner class we have to use outer class
//****Inorder to create obj of inner class we have to use obj of outer class
		Outer.Inner obj1=obj.new Inner();
        obj1.display();
//Outer.Inner obj1=new Outer.Inner(); when inner class & int var are static

}
}
