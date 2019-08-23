package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_iframes1 {
	public static void main(String[] args) 
	{
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//switchTo() to iframe using WebElement
	    WebElement	ele=driver.findElement(By.xpath("//iframe[@id='_mN_cksync_0']"));
	    driver.switchTo().frame(ele);
	    //switchTo() to iframe using iframe id
	    driver.switchTo().frame("_mN_main_224278574_0_n");
	    ele.isDisplayed();
		System.out.println("iframe is displayed");
	}
}
