
public class ClassD extends ClassA implements InterfaceB,InterfaceC{
	public void dispD() {
		System.out.println("in dispD() method of ClassD");
	}
	public void show() {
		System.out.println("in show() method implementation	");
	}
	public static void main(String[]args) {
		ClassD obj=new ClassD();
		obj.dispD();
		obj.show();
	}

}
