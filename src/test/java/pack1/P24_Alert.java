package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24_Alert {

	public static void main(String[] args) {

		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");  
        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).click();
        Alert alert=driver.switchTo().alert();
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        alert.accept();
        
        
        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).click();
        driver.switchTo().alert();
        alert.dismiss();
        
      
      
     	      	

	}

}
