package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P26_MouseActions {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		
       
		
		//right click
		Actions actions=new Actions(driver);
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		WebElement ele1=	driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(ele1).build().perform();
		
		//double click
		WebElement ele2=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(ele2).build().perform();
		
		
	}
}
