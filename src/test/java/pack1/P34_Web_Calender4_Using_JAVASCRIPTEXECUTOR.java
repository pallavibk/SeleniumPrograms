package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class P34_Web_Calender4_Using_JAVASCRIPTEXECUTOR {

	public static void main(String[] args) throws InterruptedException 
		{
			
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  driver.get("https://www.spicejet.com/"); // enter URL

		WebElement date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateval="30-12-2019";
		
		   fun1(driver,date,dateval);  
       
     }	
	public static void fun1(WebDriver driver,WebElement element,String dateval)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value = arguments[1];",element, dateval);
		
	}
			
		}
	 
	
	
	
	
	
	

