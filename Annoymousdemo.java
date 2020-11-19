package practice;
class Ann
{
	public void demo()
	{
		System.out.println("this show");
	}
}

public class Annoymousdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ann o=new Ann()
				{
			public void demo()
			{
				System.out.println("this show overriden");
			}
				};
			o.demo();

	}

}
