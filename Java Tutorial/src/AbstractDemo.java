//We cannot instantiate obj to abstract cls
//to only declare method its mandatory to use abstract keyword & so the cls
abstract class Human
{
	public abstract void eat(); //abstract method
	
	public void walk() 
	{
		
	}
}
class Man extends Human//Concrete class
//whenever we extend abstract cls we need to implement the abstract method
{
	public void eat() 
	{
		System.out.println("fd");
	}
	/*public void surf() {
		System.out.println("in");
	}*/
}
public class AbstractDemo {

	public static void main(String[] args) {
		//Human obj=new Human();Error
		Human obj=new Man();
		obj.eat();
//abstract class reference cannot be used for subclass individual methods
		/*Man obj1=new Man();
		obj1.surf();*/

	}

}
