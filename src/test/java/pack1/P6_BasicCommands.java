package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_BasicCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com/");
       // driver.findElement(By.xpath("//a[ contains(text(),'REGISTER')]")).submit(); //here e get nosuchelement exception
	System.out.println(driver.findElement(By.xpath("//a[ contains(text(),'REGISTER')]")).getTagName());
	System.out.println(driver.findElement(By.xpath("//a[ contains(text(),'REGISTER')]")).getLocation());
		driver.findElement(By.xpath("//a[ contains(text(),'REGISTER')]")).click();
		driver.close();
		

	}

}
