
public class IterationDemo_2 {
    //while,do while,for ,Nested loops
	/*print this pattern to use nested loops
	 
	 * * * * 
	 * * * *
	 * * * *
	 * * * *
	 
	 */
	public static void main(String[] args) {
		//while-1st cond checked,willnot know noof iterations
		int i=1;
		while(i<5)
		{
			System.out.println("hello");
			i++;
		}
		//do while-cond is later checked ,atleast 1 iteration occurs
		do
		{
			System.out.println("hello");
			i++;
		}while(i<5);
		//for-when we know starting & ending pt
		for(int k=1;k<5;k++)
		{
			System.out.println("hello");
		}
		//Nestedloop
		for(int m=1;m<=4;m++)
		{
			for(int n=1;n<=4;n++)
			{
				System.out.print('*');
			}
			System.out.println();
		}	
	}
}
