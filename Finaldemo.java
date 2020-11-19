package practice;

//final class sample//class cannot be inhertied
class sample
{
	int n;
	public final void get(int i)
	{
		n=i;
		System.out.println(n);
	}
}
public class Finaldemo extends sample {
	final int i;
	
	public Finaldemo()
	{
		//final char c='c';
		i=10;
		//i=12;
	}
	/*public void get(int i)  // cannot override final method
	{
		System.out.println(i);
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char c='c';
		Finaldemo ob = new Finaldemo();
		System.out.println(ob.i);
		System.out.println(c);
		
		ob.get(5);
		

	}

}
