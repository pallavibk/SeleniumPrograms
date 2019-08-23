package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_iframe3 {
	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://toolsqa.com/iframe-practice-page/");
	 //First find the element using any of locator stratedgy
	 WebElement iframeElement = driver.findElement(By.id("IF1"));
	 
	 //now use the switch command
	 driver.switchTo().frame(0);
	 
	 //Do all the required tasks in the frame 0
	 //Switch back to the main window
	  driver.switchTo().parentFrame();
	 driver.quit();
}
}
