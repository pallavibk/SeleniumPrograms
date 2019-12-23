package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_ChromeLaunch {

	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		//1) program to differentiate between get() and navigate();
		//get()==doesn't maintain cookies and history so cannot use forward and backward
		
		driver.get("http:google.com/");
		
		
		
		//2) Navigate()== maintain cookies and history so can use forward and backward
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath(("//a[contains(text(),'REGISTER')]"))).click();
		driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
        driver.quit();
		
    }
}
