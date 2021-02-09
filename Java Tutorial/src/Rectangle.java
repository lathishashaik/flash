
public class Rectangle extends Figure {
	public Rectangle(double a,double b){
		super(a,b);
	}
	public double area() {
		System.out.println("in area of rec");
		return dim1*dim2;
	}

}
