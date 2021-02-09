
public class ThisTest {
	ThisTest(){
		System.out.println("hello a");
	}
	ThisTest(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[]args) {
		ThisTest a=new ThisTest(10);
	}

}
