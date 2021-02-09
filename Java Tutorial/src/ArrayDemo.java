class Student{
	int roll_num;
	String name;
}

public class ArrayDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		Student s[]= {s1,s2,s3,s4};
		int nums[] ={81,32,34,54};
//***or int nums[]=new int[4]; nums[1]=81,nums[2]=32-----
		for(int i=0;i<4;i++)
			System.out.println(nums[i]);
	}

}
