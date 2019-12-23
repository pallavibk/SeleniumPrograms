package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_BasicCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
        driver.findElement(By.xpath("//input[@name='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("MyLName");
        driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("My Email ID");
        driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("My Mob No.");
        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("My Comp Name");
        //To submit form.
        //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
       // driver.findElement(By.xpath("//input[@name='Company']")).submit(); it is working fine with this also but it is wrong 
        driver.findElement(By.xpath("//input[@type='submit']")).submit(); 
        
//click() demo
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        
       // driver.close();
       
        
        
        
        
        
	}

}
