
public class SelectionDemo {

	public static void main(String[] args) {
		//1.if else if else
		int n=5;
		if(n%2==0)
			System.out.println("even");
		else if(n%2!=0)
			System.out.println("odd");
		else
			System.out.println("nthg");
		//2.ternary condition?exp1:exp2
		int i=8,j=0;
		/*if(i>6)
			j=1;
		else
			j=2;
		*/
		j=i>6?1:2;
		System.out.println(j);
		//3.In switch we can use strings only if versions are 1.7 & above
		String m="abc";
		switch(m) {
		case "abc":
			System.out.println("One");
			break;
		case "pqr":
			System.out.println("Two");
			break;
		case "mln":
			System.out.println("Four");
			break;
	    default:
	    	System.out.println("no match");
		}

	}

}
