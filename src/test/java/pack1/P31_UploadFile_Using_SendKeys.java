package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P31_UploadFile_Using_SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		 driver.manage().window().maximize();	
        //Launching the site.				
		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		 //Locating 'browse' button
		 WebElement browse =driver.findElement(By.id("uploadfile"));
		 //pass the path of the file to be uploaded using Sendkeys method
		 browse.sendKeys("C:\\Users\\somapurshiva\\Desktop\\test.txt");
		 //'close' method is used to close the browser window
		 driver.close();
		 
	}
}
