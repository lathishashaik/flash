
public class FirstCode 
{
	//if helloworld code works it means there is ntg wrong with jdk or eclipse
	//1.execution starts from main
	public static void main(String[]args) {
		System.out.println("Hello World");
		//2.syso ctrl+space
		System.out.println(5);
		//3.no other symbols other than $,chars at start are allowed in var
		int $1a=50_00_00_00;//_bcoz we can count zeros or digits easily
		System.out.println($1a);
		float per1=5.5f;//f is imp bcoz double is default point values in java
		double per=5.5;
		//for small int values we can use short as its size is just 2bytes
		short s=5;//-32768 to 32767
		byte b=5;//-128 to 127
		long l=5000000000l;//l
		char c='A';
		c=66;//ASCII
		System.out.println(c);
		//4.Explicit conversion
		double d=6.8;
		int k=(int)d;//Inplace of d we can have directly 6.8
		System.out.println(k);
	}
}
