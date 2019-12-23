package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class P37_Scroll {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 
		 
		 
		 // maximize browser
		  driver.manage().window().maximize();
		 
		 
		  // Open Application
		  driver.get("http://jqueryui.com");
		  
		 
		  // Wait for 5 second
		  Thread.sleep(5000);
		 
		 // This  will scroll don page 400 pixel vertical
		  ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		 		  
		  // Wait for 5 second
		  Thread.sleep(5000);
		  
		  //scroll up
		  ((JavascriptExecutor)driver).executeScript("scroll(0,-100)");
		  
		  //by visibility of element
		  JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.linkText("Linux"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	       //To scroll down the web page at the bottom of the page.
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //This will scroll the web page till end.		
	        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	          
	       //Horizontal scroll on the web page.
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

	        WebElement Element1 = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the page Horizontally till the element is found		
	        js2.executeScript("arguments[0].scrollIntoView();", Element1);
		     		 }
}


