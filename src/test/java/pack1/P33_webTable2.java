package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P33_webTable2 {

	public static void main(String[] args) throws InterruptedException {
		
//table where entire row keeps on ch
		
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//*[@id="customers"]/tbody/tr[0]/td[1]
		
	driver.get("https://www.w3schools.com/html/html_tables.asp"); // enter URL
		Thread.sleep(3000);

	String bfore_XPATH="//*[@id=\"customers\"]/tbody/tr[";
	String after_XPATH="]/td[1]";
	List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
     for(int i=2;i<row.size();i++)
       { 
	   String actualXpath=bfore_XPATH+i+after_XPATH;
	   WebElement ele=driver.findElement(By.xpath(actualXpath));
	   System.out.println(ele.getText());
       }
	
   //*[@id="customers"]/tbody/tr[2]/td[2]
		
		
		
		
	}

}
