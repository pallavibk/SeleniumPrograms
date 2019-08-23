package pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P25_Popup_Window_Hadling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
        		
        //Launching the site.				
            driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
       String Parent_WindoW=driver.getWindowHandle();
       Set<String> s1=driver.getWindowHandles();
       Iterator<String> i1=s1.iterator();
       while(i1.hasNext())			
       {
    	   String Child_WindoW=i1.next();
    	   if(!Parent_WindoW.equalsIgnoreCase(Child_WindoW))
    	   {
    		   driver.switchTo().window(Child_WindoW);
    		   driver.findElement(By.name("emailid")).click();
    	        driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
    	        driver.findElement(By.name("btnLogin")).click();
    	        driver.close();
    	   }
    	  
       }
       driver.switchTo().window(Parent_WindoW);    
   }
}
