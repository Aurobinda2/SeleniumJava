package basicselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseHover {
	
	public static void main(String [] args) throws InterruptedException
	{
		String url="https://www.spicejet.com/";
		WebDriver driver=SetupClass.setupMethod(url);
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[15]/ul/li[3]/a")).click();
		Thread.sleep(10000);
    	driver.close();
		
		
		
		
	}

}
