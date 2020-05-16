package basicselenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		String url="http://www.popuptest.com/goodpopups.html";
		WebDriver driver=SetupClass.setupMethod(url);
		WebElement link1=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]"));
		link1.click();
		Thread.sleep(10000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.close();

	}

}
