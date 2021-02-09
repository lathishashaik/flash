class A
{
	public A(){
		System.out.println("In A");
	}
	//**2**
	public A(int i){
		System.out.println("In A int");
	}
}
class B extends A
{
	public B(){
		System.out.println("In B");
	}
	//***2**
	public B(int i){
		//**
		System.out.println("In B int");
	}
}
public class SuperDemo {
//Every def constr has bydefault super()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj1=new A();
//when we create obj of subcls it will call constructor of both super&subcls
        B obj2=new B();
        //***2**
        B obj3=new B(5);//def constr of A & parameterized constr of B
//Inorder to call parameterized constr of A&B,write super(i) in //**
        B obj4=new B(5);
//Inorder to call parameterized constr of A& def of B,write super(5) in //**
        B obj5=new B();
	}

}
