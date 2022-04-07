package newpack;

class Mathoperations
{
	public void add(int d) //parameters
	{
		int a;
		a=10;
		int c;
		c=a+d;
		System.out.println("Addition="+c); 
	}
	public void sub() // break
	{
		int a,b,c;
		a=20;b=10;
		c=a-b;
		System.out.println("Sub="+c);
	}
}


public class Test {

	public static void main(String[] args) {
		
		Mathoperations ope=new Mathoperations();
		ope.add(3);
		ope.sub();
System.out.println("works fine");

	}

}
