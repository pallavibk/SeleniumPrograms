package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P32_UploadFile_Using_AutoiT {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		 driver.manage().window().maximize();	
        //Launching the site.				
		 driver.get("http://demo.automationtesting.in/Register.html");
		 //Locating 'browse' button
		driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\somapurshiva\\Desktop\\fileupload.exe");
		// driver.close();
		 
	
	}
}
