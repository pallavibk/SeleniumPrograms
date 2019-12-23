package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_CSS_Selector {

	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		//id
		boolean b=	driver.findElement(By.cssSelector("#selenium_commands")).isDisplayed();
		System.out.println(b);
		//id
		boolean b1=	driver.findElement(By.cssSelector("select#selenium_commands")).isDisplayed();
		System.out.println(b1);
		//tag.classname
		boolean b2=	driver.findElement(By.cssSelector("select.input-xlarge")).isDisplayed();
		System.out.println(b2);
		//Tag n attribute
		boolean b3=	driver.findElement(By.cssSelector("select[name='selenium_commands']")).isDisplayed();
		System.out.println(b3);
		//direct subchild
		boolean b4=	driver.findElement(By.cssSelector("div[class='controls']>select")).isDisplayed();
		System.out.println(b4);
		//any subchild
		boolean b5=	driver.findElement(By.cssSelector("div#content div")).isDisplayed();
		driver.get("https://classic.crmpro.com/index.cfm");
		//any subchild
				boolean b6=	driver.findElement(By.cssSelector("ul#[class='mlddm'] li")).isDisplayed();
		System.out.println(b6);
		driver.quit();
}
}
