package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_bootstrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(int i=0;i<list.size();i++)
		{
			WebElement ele=list.get(i);
		String inner_html=	list.get(i).getAttribute("innerHTML");
		if(inner_html.contains("JavaScript"))
		{
			ele.click();
		}
		
		}
		
	}

}
