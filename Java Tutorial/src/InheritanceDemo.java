class Calcu
{
	public int add(int i,int j) {
		return i+j;
	}
}
class CalcuAdv{
	public int add(int i,int j) {
		return i+j;
	}
	public int sub(int i,int j) {
		return i-j;
	}
}
//*2.Single Level Inheritance**No need rewrite as in CalcuAdv
class CalcAdv extends Calcu //CalcAdv is IS-A cls as it extends another cls
{
	public int sub(int i,int j) {
		return i-j;
	}
}
//*3.Multilevel Inheritance extends cls which already extends anothe cls
class CalcVeryAdv extends CalcAdv{
	public int multi(int i,int j) {
		return i*j;
	}
}
public class InheritanceDemo
//InheritanceDemo is HAS-A as it contains obj of another cls(//**1)
{
	public static void main(String[] args) {
		Calcu c1=new Calcu();//**1
		int result=c1.add(1, 4);
		System.out.println(result);
		//CalcuAdv
		CalcuAdv c2=new CalcuAdv();
		int res1=c2.add(2,6);
		int res2=c2.sub(4,1);
		System.out.println(res1);
		System.out.println(res2);
		//***2****
		CalcAdv c3=new CalcAdv();
		int result1=c3.add(2,9);
		int result2=c3.sub(32,26);
		System.out.println(result1);
		System.out.println(result2);
		//****3****
		CalcVeryAdv c4=new CalcVeryAdv();
		int $result1=c4.add(2,7);
		int $result2=c4.sub(3,2);
		int $result3=c4.multi(3,6);
		System.out.println($result1);
		System.out.println($result2);
		System.out.println($result3);


	}
}
