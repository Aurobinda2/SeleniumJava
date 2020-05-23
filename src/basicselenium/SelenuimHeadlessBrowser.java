package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SelenuimHeadlessBrowser {
	public static void main(String [] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:/Personal/Java_Automation_Selenium/chromedriver.exe");
		
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://freecrm.co.in/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Compare']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//h5")).getText());
		driver.close();
		
		
		
	}
	
	

}
