package practice;
class A

{
	public A()
	{
		System.out.println("in A con");
	}
	public A(int i)
	{
		System.out.println(i);
	}
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	public B()
	{
		super(5);
		System.out.println("in B con");
	}
	@Override
	public void show()
	{
		//super.show();
		System.out.println("in B");
		
	}
	public void show1()//it 'll not be called 
	{
		System.out.println("show 1");
	}
}


public class swa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();//runtime polymorphism
		obj.show();
	

	}

}
