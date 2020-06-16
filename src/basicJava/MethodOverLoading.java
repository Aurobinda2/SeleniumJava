package basicJava;

public class MethodOverLoading {
	
	public static void main(String [] args)
	{
		MethodOverLoading o1=new MethodOverLoading();
		o1.sum(10, 20);
		//Call overloaded main method
		main(39);
		
	}
	
	public static void main(int c)
	{
		MethodOverLoading o2=new MethodOverLoading();
		o2.sum(2.7, 6.3);
		
	}
	
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sum(double a,double b)
	{
		System.out.println(a+b);
	}

}
