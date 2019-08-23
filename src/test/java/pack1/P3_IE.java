package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class P3_IE {

	public static void main(String[] args) {
		//System.setProperty("webdriver.ie.driver",
				//"C:\\Programs\\IE\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver",
						"C://Programs//IE//IEDriverServer_x64_2.39.0//IEDriverServer.exe");	
		
		InternetExplorerDriver  driver = new InternetExplorerDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	       driver.findElement(By.name("userName")).click();
	}

}
