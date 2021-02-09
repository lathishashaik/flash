class A1{
	public void show(){
		System.out.println("in A");
	}
}
class B1 extends A1{
//@Override can be written so any mistake in methodname will be identified
//2.runtime polymorphism	
//3.Dynamic Method Dispatch
	public void show(){
		//super.show();//super is used to refer parent cls obj
		System.out.println("in B");
	}
}
class C1 extends B1{
	public void show(){
		System.out.println("in C");
	}
}
public class OverridingDemo {
//Child cls method overrides the parent cls method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B1 obj1=new B1();
        obj1.show();//**
 //**2**reference of A(super cls) &obj of B(sub cls)  we can call those
 //methods which are in A ,as obj of B for //** we get in B
        A1 obj2=new B1();//runtime polymorphism
        obj2.show();
 //***3**
        obj2=new C1();
        obj2.show();//**3**
        
	}

}
