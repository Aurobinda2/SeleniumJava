package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCalendarJSExecuter {
	
	public static void main (String [] args) throws InterruptedException
	{
		//WebDriver driver =SetupClass.setupMethod("https://www.spicejet.com/");
		SeleniumDriverClass sel1 =new SeleniumDriverClass();
		WebDriver driver=sel1.firefoxdiver();
		driver.get("https://www.redbus.in/");
		String date="10-Jun-2020";
		WebElement datePicker =driver.findElement(By.id("onward_cal"));
		date_select(driver,datePicker,date);
		
		
	}
	
	public static void date_select(WebDriver driver,WebElement element,String date)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
	}

}
