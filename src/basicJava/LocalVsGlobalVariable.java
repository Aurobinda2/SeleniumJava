package basicJava;

public class LocalVsGlobalVariable {
	int age=27;
	String state="Odisha";
	int i=50;
	
	public static void main(String [] args)
	{
		int i=19;
		LocalVsGlobalVariable l1=new LocalVsGlobalVariable();
		//Print Local i
		System.out.printf("Local i inside main() method : %d \n",i);
		//Print Global i
		System.out.printf("Local i for object L1 : %d\n",l1.i);
		//Only change i of L1
		l1.i=60;
		LocalVsGlobalVariable l2=new LocalVsGlobalVariable();
		System.out.printf("Local i for object L2: %d \n",l2.i);
		System.out.printf("Local i for object L1 after modificatio: %d \n",l1.i);
		//Print sum() i value 
		l1.sum();
			
	}
	
	public void sum()
	{
		int i=23;
		System.out.printf("Local i for for function sum(): %d \n",i);
	}
		

}
