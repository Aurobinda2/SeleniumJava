package basicJava;

//extends from Employee class

public class Developer extends Employee {
	static int id=0;
	public void setEmployeeCode()
	{
		this.defaultEmployeeCode="abc@Developer";
		
	}
	
	public void setEmployeeId()
	{   id+=1;
		this.defaultEmployeeId="abc1"+Integer.toString(id);
		
		
	}
	
	

}
