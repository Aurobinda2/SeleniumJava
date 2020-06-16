package basicJava;

public class CallByValueVsCallByReference {
	int a=10;
	int b=20;
	public static void main(String [] args)
	{
		CallByValueVsCallByReference o1=new CallByValueVsCallByReference();
		o1.addition(o1.a,o1.b);
		System.out.println(o1.a);
		System.out.println(o1.b);
		CallByValueVsCallByReference o2=new CallByValueVsCallByReference();
		System.out.println("************************************");
		o1.multipication(o2);
		System.out.println(o2.a);
		System.out.println(o2.b);
		
	}
	
	//Pass by value method 
	public void addition(int a,int b)
	{
		 a=30;
		 b=40;
		 
		 System.out.println(a+b);	
	}
	
	//Pass by reference method
	
	public void multipication(CallByValueVsCallByReference o2)
	{
		o2.a=40;
		o2.b=2;
		System.out.println(o2.a*o2.b);
	}
	

}
