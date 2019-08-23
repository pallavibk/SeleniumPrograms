package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P12_MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		WebElement ele=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select obj= new Select(ele);
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		obj.selectByIndex(2);
		obj.selectByIndex(3);
		
	
	List<WebElement> allopt1=obj.getAllSelectedOptions();
	System.out.println("allopt1.size()="+allopt1.size());
	for(int i=0;i<allopt1.size();i++)
	{
	String el=allopt1.get(i).getText();
	System.out.println("get all selected="+el);
	}
	WebElement allopt2=obj.getFirstSelectedOption();
	System.out.println("First selected="+allopt2.getText());
	
	boolean b=obj.isMultiple();
	System.out.println(b);
		
obj.deselectAll();
		  List<WebElement> allopt=obj.getOptions();
		  for(int i=0;i<allopt.size();i++)
		  { 
			  boolean el=allopt.get(i).isSelected();
		  System.out.println("after all deselect="+el);
		  }
		 
	}
}
