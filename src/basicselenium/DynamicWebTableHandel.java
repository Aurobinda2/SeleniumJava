package basicselenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicWebTableHandel {
	
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=SetupClass.setupMethod("http://demo.guru99.com/test/web-table-element.php");
		//Method-1
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		List <WebElement> table_rows=driver.findElements(By.tagName("tr"));
		String before_xpath="//*[@id='leftcontainer']/table/tbody/tr[";
		String after_xpath="]/td[3]";
		
		for(int i=2 ;i<table_rows.size();i++)
		{
			
		  WebElement table_data=driver.findElement(By.xpath(before_xpath+i+after_xpath));
		  WebElement compny=driver.findElement(By.xpath(before_xpath+i+"]/td[1]"));
		  if (Float.parseFloat(table_data.getText())>500)
		  {
		  System.out.println("Compny :"+compny.getText()+" value:"+table_data.getText());
		  }
		  
		
		}
		Thread.sleep(10000);
		driver.close();

	}
		
		
		
	}


