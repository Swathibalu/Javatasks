package practice;

public class Staticdemo {
	String name;
	int id;
	static String ceo;
	static int time;
	static int salary;

	static //execute only once when the class is loaded
	{
		time=8;
		salary=20;
		System.out.println("static 1");
	}
	
	public Staticdemo(String n,int i) //execute everytime when the object is created 
	{
		// TODO Auto-generated constructor stub
		name=n;
		id=i;
		
	}
	static //execute only once when the class is loaded
	{
		ceo = "amutha";
		System.out.println("static 2");
	}
	void show()
	{
		System.out.println(name+" "+id+" "+ceo+" "+time+" "+"salary");
	}
static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i=9;
		Staticdemo ob1=new Staticdemo("swa",1);
		Staticdemo ob2=new Staticdemo("balu",2);
		//Staicdemo.ceo="madhu";
		ob1.show();
		ob2.show();
		
		

	}

}
