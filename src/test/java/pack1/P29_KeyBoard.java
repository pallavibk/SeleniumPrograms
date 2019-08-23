package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P29_KeyBoard {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		
        //Launching the site.				
        driver.get("https://demoqa.com/autocomplete/");			
        driver.manage().window().maximize();
		Actions actions=new Actions(driver);
	    WebElement ele=	driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		actions.keyDown(ele, Keys.SHIFT).sendKeys("PALLAVI").keyUp(Keys.SHIFT).build().perform();
		actions.sendKeys(Keys.SPACE);
		actions.sendKeys("kundagol").build().perform();
	    //actions.sendKeys(Keys.TAB);
		//actions.sendKeys(Keys.ENTER);
		driver.close();
	}
}
