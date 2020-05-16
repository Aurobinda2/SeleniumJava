package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Personal/Java_Automation_Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();
	}

}
