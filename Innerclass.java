package practice;

public class Innerclass {
	int n=2;
	public void show()
	{
		System.out.println(n);
	}
	static class Inner
	{
		int n1=3;
		public void display()
		{
			System.out.println(n1);
		}
		class H extends Inner
		{
			public void show1()
			{
				System.out.println(n1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Innerclass o=new Innerclass();
		o.show();
		//Innerclass.Inner o1=o.new Inner();//for non static class
		Innerclass.Inner o1=new Innerclass.Inner();
		o1.display();
		Inner.H o2 = o1.new H();
		o2.show1();
	}

}
