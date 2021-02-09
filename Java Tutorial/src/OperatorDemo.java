
public class OperatorDemo {
     /*
      * Arithmetic +,-,*,/,%
      * Increment pre post
      * Bitwise    << >>
      * Relational
      * Logical
      */
	public static void main(String[] args) {
		//1.Arithmetic
		int m=6,n=4;
		int r1=m/n ;//gives quotient
		double r2=(double)m/n;
		int r3=m%n;//gives remainder
		System.out.println(r1);//1
		System.out.println(r2);//1.5
		System.out.println(r3);//2
		//pre inc=1st inc the value & then assign
        m=++n;//m=5,n=5
        m=n++;//m=4,n=5

	}

}
