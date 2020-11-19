package practice;

interface demointer {
	void get();

}
class Exm1 extends Finaldemo implements demointer
{
	public void get()
	{
		System.out.println("this example1");
	}
}
class Exm2 implements demointer
{
	public void get()
	{
		System.out.println("this example2");
	}
}
class Example1 {
	public void demo(demointer d)
	{
		d.get();
	}
}
	public class Example2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		demointer d=new Exm1();
		//demointer d1=new Exm2();
		//Exm1 a=new Exm1();
		Example1 ex=new Example1();
		ex.demo(d);
		
	}

}

