package basicselenium;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumChekBox {
	
	public static void main(String[] args){
		
		
		SeleniumDriverClass sel1=new SeleniumDriverClass();
		WebDriver driver=sel1.chromediver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
		for(int i=0;i<elements.size();i++)
		{
			if (i==2 || i == 3)
			{
				elements.get(i).click();
			}
		}
	}
}