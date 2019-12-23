package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class P34_Web_Calender2 {

	public static void main(String[] args) throws InterruptedException 
		{
			
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

		driver.get("https://www.spicejet.com/"); // enter URL
	
		String date="30-January-2019";
		String datearra[]=date.split("-");
		String day=datearra[0];
		String month=datearra[1];
		String year=datearra[2];
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
				
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[1]
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[2]
			
		String before_xpath="//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[";
		String after_XPath="]/td[";
		
		final int totalweekdays=7;
		boolean flag=false;
		String dayval=null;
		for(int row=2;row<=7;row++)
		{
			for(int col=1;col<=totalweekdays;col++)
			{
				try
				{
				dayval=driver.findElement(By.xpath(before_xpath+row+after_XPath+col+"]")).getText();
				}
				catch(NoSuchElementException e)
				{
				System.out.println("Please Enter valid date");
				flag=false;
				break;
				
		}
				if(dayval.equals(day))
				{
					driver.findElement(By.xpath(before_xpath+row+after_XPath+col+"]")).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
			break;
			}
		}
				
      
		
        
       
     }		
			
		}
	 
	
	
	
	
	
	

