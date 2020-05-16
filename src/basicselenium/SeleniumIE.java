package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumIE {

	public static void main(String[] args) {
			System.setProperty("webdriver.ie.driver", "C:/Personal/Java_Automation_Selenium/IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.close();


	}

}
