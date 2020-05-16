package basicselenium;

import org.openqa.selenium.WebDriver;

public class SeleniumNavigater {
	public static void main(String [] args) throws InterruptedException
	{   
		SeleniumDriverClass sel1=new SeleniumDriverClass();
		WebDriver driver=sel1.chromediver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.close();
		
		
		
			
	}

}
