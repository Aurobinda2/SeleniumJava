package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriverClass {
	
	public WebDriver chromediver()
	{
		System.setProperty("webdriver.chrome.driver","C:/Personal/Java_Automation_Selenium/chromedriver.exe");
		WebDriver chrome_driver=new ChromeDriver();
		return chrome_driver;
	}
	public WebDriver firefoxdiver()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Personal/Java_Automation_Selenium/geckodriver.exe");
		WebDriver firefox_driver=new FirefoxDriver();
		return firefox_driver;
	}
	
	public WebDriver iediver()
	{
		System.setProperty("webdriver.ie.driver", "C:/Personal/Java_Automation_Selenium/IEDriverServer.exe");
		WebDriver ie_driver=new InternetExplorerDriver();
		return ie_driver;
	}
	

}
