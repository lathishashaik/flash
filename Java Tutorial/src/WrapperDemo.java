//int,float,double
//Integer
public class WrapperDemo {
//speed of primitive>Wrapper cls
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;//i is primitive datatype var
		Integer ii =new Integer(4);//ii is ref var & Integer is Wrappercls 
        Integer iii=new Integer(i);//Boxing-Wrapping**1**
        int j=iii.intValue();//unBoxing-unWrapping**2**
        //same as **1**,**2**
        Integer value=i;//AutoBoxing
        int k=value;//AutoUnboxing
        
        //*******2********Converting str to int
        String str="123";
        int n=Integer.parseInt(str);
        System.out.println(n);
	}

}
