package basicJava;

public class JavaMethodsSample1 {
	public int add(int a,int b)
	{
		int result =a+b;
		return result;
	}
	public  static void  sub(int c, int d)
	{
		int result=c-d;
		System.out.println(result);
	}
public static void main(String [] args)
{
	JavaMethodsSample1 j=new JavaMethodsSample1();
	int x=j.add(10,7);
	System.out.println(x);
	sub(10,3);
}



}
