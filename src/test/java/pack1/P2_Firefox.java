package pack1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class P2_Firefox {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Programs\\GekoDriver\\geckodriver-v0.24.0-win64\\GekoDriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.close();
	}

}
