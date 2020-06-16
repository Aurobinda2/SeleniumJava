package basicJava;

//extends from Employee class

public class managerClass extends Employee {
	static int id=0;
	public void setEmployeeCode()
	{
		this.defaultEmployeeCode="abc@Manager";
		
	}
	
	public void setEmployeeId()
	{   id+=1;
		this.defaultEmployeeId="abc1"+Integer.toString(id);
		
		
	}
	
	

}
