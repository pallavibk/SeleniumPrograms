package pack1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17_Minimize_MAximimse {


	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.manage().window().setPosition(new Point(-200,0));
	}	
	
}
