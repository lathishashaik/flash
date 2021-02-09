class Calct{
	public int add(int...n)//{1,3,5,4,9} //Variable length arguments
	{
		int sum=0;
		for(int k:n)
			sum=sum+k;
		return sum;
	}
}
public class Varags {
	//irrespective of noof inputs it works
	public static void main(String[] args) {
		Calct obj=new Calct();
		System.out.println(obj.add(1,3,5,4,9));
	}

}
