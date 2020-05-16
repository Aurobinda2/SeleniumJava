package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Personal/Java_Automation_Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();

	}

}
