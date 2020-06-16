package basicJava;

public class StaticVsNonstatic {
	
	String Name="Aurobinda";
	static String state="Odisha";
	
	public static void main(String [] args)
	{
		System.out.printf("Static value called by class name for object s1 : %s \n",StaticVsNonstatic.state);
		System.out.printf("Static value called by method for object s1 : %s \n",state());
		System.out.printf("Static value called directly for object s1 : %s\n",state);
		state="Assam";
		System.out.printf("Static value called by class name for object s1 : %s \n",StaticVsNonstatic.state);
		System.out.printf("Static value called by method for object s1 : %s \n",state());
		System.out.printf("Static value called directly for object s1 : %s\n",state);
		
		System.out.println("*************************************************");
		
		StaticVsNonstatic s1=new StaticVsNonstatic();
		StaticVsNonstatic s2=new StaticVsNonstatic();
		//It create error : Non static member can't call by class name.
		//System.out.printf("Nonstatic value called by class name for object s1 : %s \n",StaticVsNonstatic.Name);
		System.out.printf("Nonstatic value called by method for object s1 : %s \n",s1.name());
		System.out.printf("Nonstatic value called directly for object s1 : %s\n",s1.Name);
		s1.Name="Raju";
		System.out.printf("Nonstatic value called by method for object s2 : %s \n",s2.name());
		System.out.printf("Nonstatic value called directly for object s2 : %s\n",s2.Name);
		
		
		
		
	}
	
	
	public  String  name()
	{
		return this.Name;
	}
	
	public static String state()
	{
	   return StaticVsNonstatic.state;
	}
	
	

}
