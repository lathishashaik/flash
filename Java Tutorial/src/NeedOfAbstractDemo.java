class Printer{
	public void show(Integer i) {
		System.out.println(i);
	}
	public void show(Double i) {
		System.out.println(i);
	}
//**2**Accepts any num without being specific instead of using different methods like above 2
	public void show1(Number i) 
	{
		System.out.println(i);
	}
}
public class NeedOfAbstractDemo {

	public static void main(String[] args) {
		Printer obj=new Printer();
		obj.show(5);
		obj.show(4.5);
		obj.show1(5.4f);
	}

}
