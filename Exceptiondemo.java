package practice;
public class Exceptiondemo {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=6;
			
			int i=1;
			int j=0;
			int k=i/j;
			System.out.println(k);
			
		
		}
		catch(ArithmeticException e)
	{
	System.out.println(e);
		}
		catch(Exception e)
		{
		System.out.println("error");
			}
		finally
		{
			System.out.println("bye");
		}
	}

}
