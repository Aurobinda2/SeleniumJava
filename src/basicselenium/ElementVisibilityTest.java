package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementVisibilityTest {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=SetupClass.setupMethod("https://www.makemytrip.com/");
	WebElement loginButton= driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[1]/ul/li[6]/div/p"));
	//Check Login button is displayed or not
	if (loginButton.isDisplayed()== true)
	{   //If displayed then click on login button.
		loginButton.click();
		WebElement submitButton=driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/form/div[2]/button"));
		if (submitButton.isEnabled()==false)
		{
			WebElement emailField=driver.findElement(By.id("username"));
			emailField.clear();
			emailField.sendKeys("abc@gmail.com");
			//Check Continue Button 
			System.out.println(submitButton.isEnabled());
			WebElement createAccount=driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/div[3]/p/span[2]/a"));
			//Click on create Account button 
			createAccount.click();
			//check checkbox selected or not 
			System.out.println(driver.findElement(By.id("tnc")).isSelected());
			driver.close();
			
		}
		
	}
	else
	{ 
		//if login button is not displayed in first time then it try to sleep for 10 second and then try
		// to check the login button.
		Thread.sleep(10000);
		if(loginButton.isDisplayed()!= true){driver.close();}
	}
	}

}
