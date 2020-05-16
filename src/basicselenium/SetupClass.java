package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SetupClass {
	
	public static WebDriver setupMethod(String url)
	{
		SeleniumDriverClass sel1 =new SeleniumDriverClass();
		WebDriver driver=sel1.chromediver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return  driver;
		
	}

}
