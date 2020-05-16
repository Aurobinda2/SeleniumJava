package basicselenium;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumRadioButton {
	
	public static void main(String[] args){
		
	
	SeleniumDriverClass sel1=new SeleniumDriverClass();
	WebDriver driver=sel1.chromediver();
	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	driver.manage().window().maximize();
	List<WebElement> elements=driver.findElements(By.xpath("//input[@name='ageGroup']"));
	for(WebElement ele:elements)
	{
	   String value=ele.getAttribute("value");
	   if (value.equalsIgnoreCase("0 - 5"))
	   {
		   ele.click();
		   break;
	   }
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.close();
	
	}
}
	
