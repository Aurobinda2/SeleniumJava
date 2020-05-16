package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Reference: https://www.guru99.com/implicit-explicit-waits-selenium.html

public class SeleniumExplicitWait {
	public WebElement ExplictWait(WebDriver driver){
		
		WebElement element=driver.findElement(By.xpath("//*[@id='rt-header']/div/div[1]/div/a/img"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement linkElement=wait.until(ExpectedConditions.elementToBeClickable(element));
		return linkElement;
		
	}
	public static void main(String [] args) throws InterruptedException
	{
		String url="http://demo.guru99.com/test/guru99home/";
		WebDriver driver=SetupClass.setupMethod(url);
		SeleniumExplicitWait s1=new SeleniumExplicitWait();
		WebElement ele=s1.ExplictWait(driver);
		ele.click();
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
