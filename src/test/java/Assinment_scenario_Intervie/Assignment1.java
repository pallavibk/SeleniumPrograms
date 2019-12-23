package Assinment_scenario_Intervie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Scenario-1
		//launch url
		driver.get("https://dev.trackwalkins.com/#/login");
		//click on user id and send value
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("demo@mailinator.com");
	
		//click 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("walkins@123");
		
		//login button
		driver.findElement(By.xpath("//button/span[@class='mat-button-wrapper']")).click();
		
		Thread.sleep(9000);
	
		//click on communication tab
		WebElement ele=driver.findElement(By.xpath("//mat-icon[@ class='sidebar-icon svg mat-icon ng-star-inserted' and @ng-reflect-svg-icon='Communication Mgmt']"));
		ele.click();
		//click on sendSMS
		Actions action=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Send SMS')]"));
		action.moveToElement(ele1).build().perform();
		ele1.click();
		Thread.sleep(9000);
		
		//scenario-2
		driver.findElement(By.xpath("//mat-radio-button[@color='accent']/label[@for='mat-radio-3-input']/div/div[@class='mat-radio-outer-circle']")).click();
		driver.findElement(By.xpath("//button/span[contains(text(),' Select picture')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'folder')]")).click();
		Thread.sleep(9000);
		
		Runtime.getRuntime().exec("C:\\Users\\somapurshiva\\Desktop\\fileupload2.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='mat-raised-button mat-primary m-right-30p mat-button' and @ng-reflect-disabled='false']/span[contains(text(),'select')]")).click();
		Thread.sleep(5000);
		
		//scenario-3
		driver.findElement(By.xpath("//div[contains(text(),'Manual Post')]")).click();
		Thread.sleep(5000);
		
		//Scenario-4
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Mobile Number']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Mobile Number']")).sendKeys("9960111018");
		driver.findElement(By.xpath("//button[contains(text(),'ADD NUMBERS')]")).click();
		
		
		//scenario-5
		WebElement ele3=driver.findElement(By.xpath("//select[@id='country' and @ng-reflect-model='blank']"));
		Select obj=new Select(ele3);
		obj.selectByIndex(1);
		
		Thread.sleep(5000);
		//scenario-6
		driver.findElement(By.xpath("//textarea[@ng-reflect-name='message']")).click();
		Thread.sleep(5000);
		//String str="Hi good morning";
		driver.findElement(By.xpath("//textarea[@ng-reflect-name='message']")).sendKeys("9960111017");
		String sentStr=	driver.findElement(By.xpath("//textarea[@ng-reflect-name='message']")).getAttribute("value");
		System.out.println("sentStr = "+sentStr);
		driver.findElement(By.xpath("//button/span[contains(text(),'Send Now')]")).click();
		Date sentdate=new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
		String sentDate = simpleDateFormat.format(sentdate);
		Thread.sleep(9000);
		
		//scenario-7
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'No')]")).click();
		String capturedDate=driver.findElement(By.xpath("/html/body/div[1]/app-dashboard/mat-sidenav-container/mat-sidenav-content/app-sms-report/div/div[2]/div/table/tbody/tr[1]/td[1]")).getText();

		//Scenario-8
		String recdStr=driver.findElement(By.xpath("//div[@class='ng-star-inserted' and contains(text(),'9960111017')]")).getText();
		System.out.println("sentStr.concat(sentDate) = "+sentStr.concat(sentDate));
		System.out.println("recdStr.concat(capturedDate) = "+recdStr.concat(capturedDate));
		Assert.assertEquals(sentStr.concat(sentDate), recdStr.concat(capturedDate));
		System.out.println("Scenarion8 success");
		driver.close();
	}
}
