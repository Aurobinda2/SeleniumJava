package basicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScrptPopHandel {
	public static void main(String [] args) throws InterruptedException
	{
		SeleniumDriverClass sel1=new SeleniumDriverClass();
	    WebDriver driver=sel1.chromediver();
	    driver.get("http://www.seleniumframework.com/Practiceform/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@id='alert']")).click();
	    Alert alt =driver.switchTo().alert();
	    String msg=alt.getText();
	    System.out.println(msg);
	    if (msg.equals("Please share this website with your friends and in your organization."))
	    {
	    	System.out.println("Passed");
	    }
	    Thread.sleep(3);
	    alt.accept();
	    Thread.sleep(5);
	    driver.close();
	    
	    //Timely alert
	    
	    driver.get("http://www.seleniumframework.com/Practiceform/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@id='alert']")).click();
	    
	    
	}

}
