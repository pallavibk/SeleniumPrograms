package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P11_singleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		WebElement ele=driver.findElement(By.xpath("//select[@id='continents']"));
		Select obj= new Select(ele);
	    List<WebElement> allopt=	obj.getOptions();
	    for(int i=0;i<allopt.size();i++)
	     {
		String el=allopt.get(i).getText();
		System.out.println(el);
	     }
	   obj.selectByIndex(5);
		//obj.selectByValue("Europe");
		obj.selectByVisibleText("Australia");
		boolean b=obj.isMultiple();
		System.out.println(b);
		
	}
}
