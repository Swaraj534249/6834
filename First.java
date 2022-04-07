package amit;


class Second
{
	public void show()
	{
		System.out.println("I am from show");
	}
	
}


class third
{
	public void display()
	{
		System.out.println("I am from display");
	}
}



public class First {//break

	public static void main(String[] args) {
		
		  Second madaswmi=new Second();
		   madaswmi.show();
		   System.out.println("Hi from main");
		   third obj=new third();
		   obj.display();
		
		

	}

}
