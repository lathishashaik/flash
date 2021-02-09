class Casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i,int j)
	{
		System.out.println(i+j);
	}
	
}
public class MethodOverloadingDemo {
    //when we have multiple methods with same name but diff parameters
	public static void main(String[] args) {
		Casio obj=new Casio();
		obj.add(1, 2);
		obj.add(1, 2,3);
		obj.add(1.2, 2);
	}

}
