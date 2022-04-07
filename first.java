package firstpkg;


class second{
	public void show()
	{
		System.out.println("second line");
	}
	public void dont()
	{
		System.out.println("third line");
	}
}
class math{
	public void operation(int a, int b)
	{
		int add,sub;
		add=a+b;
		sub=a-b;
		System.out.println(add);
		System.out.println(sub);

	}
	
}

public class first {

	public static void main(String[] args) {
		System.out.println("first line");
		second line=new second();
		line.show();
		line.dont();
		math result=new math();
		result.operation(5,4);

	}

}