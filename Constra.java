package practice;

public class Constra {
	int n1;
	int n2;

	public Constra(int n1,int n2) {
		this.n1=n1;//current object
		this.n2=n2;
		//n1=n1;
		//n2=n2;
		
	}
	public Constra(Constra c)//copy constructor
	{
		n1=c.n1;
		n2=c.n2;
		
	}
	public void display()
	{
		System.out.println(n1+" "+n2);
	}

	public static void main(String[] args) {
		Constra ob=new Constra(2,3);
		ob.display();
		Constra ob1=new Constra(ob);//pass object of sample constructor
		ob1.display();
		ob1.n1=10;
		ob1.n2=20;
		ob1.display();
		
	}

}
