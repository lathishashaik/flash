//Encapsulation :Binding data with methods(getters & setters)

class Student1
{
    private int roll_num;
    private String name;
    //getters & setters:right click SOURCE generate getters & setters
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
  
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setRoll_num(6);
		s1.setName("ram");
		System.out.println(s1.getRoll_num());
		System.out.println(s1.getName());
	}

}
