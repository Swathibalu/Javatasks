package practice;
//Encapsulation->Binding of data with metho
class E
{
	private int n;
	private String name;
	public void setn(int i,String s)
	{
		n=i;
		name=s;
	}
	public int getn()
	{
		return n;
	}
	public String getname()
	{
		return name;
	}
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj=new E();
		obj.setn(5,"swa");
		
		
		System.out.println(obj.getn());
		System.out.println(obj.getname());
		

	}
}
