package practice;
abstract class pen
{
	public abstract void write();
	public void sam()
	{
		System.out.println("hi");
	}
}

class check extends pen
{
	/*public void show(Integer i)
	{
		System.out.println(i);
	}
	public void show(Double i)
	{
		System.out.println("hi");
	}*/
	public void write()
	{
		System.out.println("Write");
	}
	
	public void show(Number i) //number is a abstract class which is extended /integer,double,floatetc
	{
		System.out.println(i);
	}
	public void show(Character i)
	{
		System.out.println(i);
	}
}
public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check o=new check();
		o.write();
		o.show(2.2f);
		o.sam();
		check o1=new check();
		o1.show('a');

	}

}
