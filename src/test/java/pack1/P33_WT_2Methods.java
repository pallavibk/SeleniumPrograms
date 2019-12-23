package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P33_WT_2Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		//when atleast 1 column is fixed in table
		
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

				
						
			driver.get("https://classic.crmpro.com/login.cfm"); // enter URL
				
				driver.findElement(By.name("username")).sendKeys("kpallavi");
				driver.findElement(By.name("password")).sendKeys("kpallavi");
				Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				driver.switchTo().frame("mainpanel");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
				//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
				//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
				//*[@id="vContactsForm"]/table/tbody/tr[20]/td[2]/a
				
				String b4_xpath="//*[@id=\"vContactsForm\"]/table/tbody/tr[";
				String after_xpath="]/td[2]/a";
				
				List<WebElement> Row=driver.findElements(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr"));
				System.out.println(Row.size());
				for(int i=4;i<Row.size();i++)
				{
					String name=driver.findElement(By.xpath(b4_xpath+i+after_xpath)).getText();
					System.out.println(name);
					if(name.equalsIgnoreCase("Mukta Sharma"))
					{
						driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
						
					}
				}
				//method2
				driver.findElement(By.xpath("//a[contains(text(),'David Cris')]//parent::td//preceding-sibling::td/input[@value='52707701']")).click();
			
				//to print content of table
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				for(int i=1;i<=4;i++)
				{
				String t_ele=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]")).getText();
				System.out.println(t_ele);
				}
				
				
				//driver.close();

	}

}
