package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		SeleniumDriverClass sel1=new SeleniumDriverClass();
		WebDriver driver=sel1.chromediver();
		//WebDriver driver=sel1.firefoxdiver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//Locator : id
		By element=By.id("txtUsername");
		driver.findElement(element).sendKeys("Admin");
		//locator : name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//locator:xpath
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//locator : link text
		
		String text=driver.findElement(By.linkText("Welcome Admin")).getText();
		System.out.println(text);
		assert text == "Welcome Admi";
		//locator : cssSelector
		driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div > a > img")).click();
		//locator: tagname
		//driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Aurobinda");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.close();
		
		
		
		
	}

}
