package basicJava;

public class ManageManagerandDevloper {
	
	public static void main(String [] args)
	{
		
		managerClass m1=new managerClass();
		Developer d1=new Developer();
		m1.setEmployeeCode();
		m1.setEmployeeId();
		d1.setEmployeeCode();
		d1.setEmployeeId();
		System.out.println("Manager Details :");
		System.out.println(managerClass.Compny);
		System.out.println(m1.defaultEmployeeCode);
		System.out.println(m1.defaultEmployeeId);
		System.out.println("***************************");
		System.out.println(Developer.Compny);
		System.out.println(d1.defaultEmployeeCode);
		System.out.println(d1.defaultEmployeeId);
		
		
	}

}
