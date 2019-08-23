package pack1;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P30_ScrollDownByPicxle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		
        //Launching the site.				
        driver.get("http://demo.guru99.com/test/guru99home/");			
        driver.manage().window().maximize();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,1000)");
       
           
       //ScrollDown_Using_VisibilityOfElement
    				
       driver.get("http://demo.guru99.com/test/guru99home/");			
       driver.manage().window().maximize();
        WebElement Element = driver.findElement(By.linkText("Linux"));
      js.executeScript("arguments[0].scrollIntoView();",Element );
        
      // Launch the application		
      driver.get("http://demo.guru99.com/test/guru99home/");

      //This will scroll the web page till end.		
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
      
       //scroll horizontally
      
      // Launch the application		
      driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

      WebElement Element1 = driver.findElement(By.linkText("VBScript"));

      //This will scroll the page Horizontally till the element is found		
      js.executeScript("arguments[0].scrollIntoView();", Element1);
    }
        
	}


