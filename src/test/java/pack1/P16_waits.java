package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P16_waits 
{
	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//page load timeout
		
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
               		
		WebDriverWait wait =new WebDriverWait(driver,30);
		WebElement ele=driver.findElement(By.xpath("//select[@id='continents']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='continents']")));
		  
		 
	}
	
	
}
