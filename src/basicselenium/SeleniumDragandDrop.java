package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragandDrop {
	
	public static void main (String [] args) throws InterruptedException
	{
		String url="https://jqueryui.com/droppable/";
		WebDriver driver=SetupClass.setupMethod(url);
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		Thread.sleep(200);
		driver.close();
		
	}

}
