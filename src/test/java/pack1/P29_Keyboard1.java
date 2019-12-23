package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P29_Keyboard1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://newtours.demoaut.com/");
		
	WebElement ele=	driver.findElement(By.name("userName")) ; 
	WebElement ele2=	driver.findElement(By.name("password"));
			
    Actions actions=new Actions(driver);
	actions.sendKeys(ele, "batman").keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").keyDown(ele2,Keys.CONTROL).sendKeys("v").build().perform();
    driver.findElement(By.name("login")).click();

}
}
