package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P27_MouseActions1 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		Actions actions=new Actions(driver);
	   	       
        		//drag and drop
		   driver.get("https://demoqa.com/droppable/");
		   WebElement source=	driver.findElement(By.id("draggable"));
		WebElement destination=	driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source,destination).build().perform();
	
		
		
	}
}
