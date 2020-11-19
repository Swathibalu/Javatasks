package practice;

public interface demointerface {
	void get();

}
class Ex1 implements demointerface
{
	public void get()
	{
		System.out.println("this example1");
	}
}
class Ex2 implements demointerface
{
	public void get()
	{
		System.out.println("this example2");
	}
}
class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demointerface d=new Ex1();
		demointerface d1=new Ex2();
		d.get();
		d1.get();
	}

}