class Ab{
	public void showa(){
		System.out.println("In a show");
	}
}
class Bc extends Ab{
	public void showa(){
		System.out.println("Im  best");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ab obj=new Ab();
//obj.showa();//But u want todisplay im the best so create another cls
//which extends cls Ab & a showa() methods which oerrides
		Ab obj=new Bc();
		obj.showa();
		//***other way****
		Ab obj1=new Ab()
				{                                        
					public void showa(){
						System.out.println("Im the best"); 
					}
				};
		obj1.showa();

	}

}
