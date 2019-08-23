package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_checkbox_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		GenericMethods obj= new GenericMethods();
		obj.checkboxmethod(driver,"profession","Automation Tester");

	}

}
