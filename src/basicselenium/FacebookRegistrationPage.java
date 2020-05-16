package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {

	public static void main(String[] args) {
		System.setProperty("driver.webdriver.chrome","C:/Personal/Java_Automation_Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Aurobinda");
		driver.findElement(By.xpath("//*[@id='u_0_7']")).click();
		Select date_select=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		date_select.selectByIndex(11);
		Select month_select=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		month_select.selectByValue("7");
		Select year_select=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		year_select.selectByVisibleText("1991");
		driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
		driver.close();
		
		
		
		
		
		
	}

}
