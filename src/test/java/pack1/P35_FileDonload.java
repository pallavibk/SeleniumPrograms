package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P35_FileDonload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //To open URL
			 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
			 //Download Text File
			 driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
			 //To call the AutoIt script
			 Runtime.getRuntime().exec("C:\\Users\\somapurshiva\\Desktop\\filedonload.exe");
			driver.close();
	}

}
