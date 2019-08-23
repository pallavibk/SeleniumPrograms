package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P28_MouseActions2 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		Actions actions=new Actions(driver);
	   	        
        		//mouseover 
		  driver.get("http://demoqa.com/menu/");
		   WebElement ele1=	driver.findElement(By.id("ui-id-9"));
		   WebElement ele2=	driver.findElement(By.id("ui-id-10"));
		   WebElement ele3=	driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
		   actions.moveToElement(ele1).perform();
		   Thread.sleep(2000);
		   actions.moveToElement(ele2).perform();
		   Thread.sleep(2000);
		  ele3.click();
	}
}
