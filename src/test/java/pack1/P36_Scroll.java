package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class P36_Scroll {
	
	
	

	@Test(priority=1)
	public void scrollingToBottomofAPage() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 
		 
		 
		 // maximize browser
		  driver.manage().window().maximize();
		
		
		

	        //Horizontal scroll on the web page.
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

	        WebElement Element1 = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the page Horizontally till the element is found		
	        js2.executeScript("arguments[0].scrollIntoView();", Element1);
	}

	

}
