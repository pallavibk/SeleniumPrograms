package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatorsPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
	    System.out.println(driver.findElement(By.id("root")).isDisplayed());
	    System.out.println(driver.findElement(By.className("bgGradient")).isDisplayed());
	    driver.get("http://newtours.demoaut.com/");
	    System.out.println(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());
	    System.out.println(driver.findElement(By.partialLinkText("SIGN")).isDisplayed());
	    System.out.println(driver.findElement(By.name("userName")).isDisplayed());
	    System.out.println(driver.findElement(By.tagName("input")).isDisplayed());
	    
	    //xpath -Absoulte xpath
	    System.out.println(driver.findElement(By.xpath("html/body/div/table")).isDisplayed());
	    
	    //Relative path
	    System.out.println(driver.findElement(By.xpath("//div")).isDisplayed());
	    
	    //1 attribute- By *
	    System.out.println(driver.findElement(By.xpath("//*[@class='mouseOut']")).isDisplayed());
	    
	    //1 attribute -By tag name
	    System.out.println(driver.findElement(By.xpath("//td[@class='mouseOut']")).isDisplayed());
	    
	    //multiple attribute
	    System.out.println(driver.findElement(By.xpath("//input[@type='text'][@name='userName']")).isDisplayed());
	    
	    //USing AND
	    System.out.println(driver.findElement(By.xpath("//input[@type='text' and @name='userName' ]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//*[@type='text' and @name='userName' ]")).isDisplayed());
	    
	    //USing OR
	    System.out.println(driver.findElement(By.xpath("//input[@type='text' or @name='userName' ]")).isDisplayed());
	    
	    //text()
	    System.out.println(driver.findElement(By.xpath("//a[text()='SIGN-ON']")).isDisplayed());
	    
	    
	    //Contains()
	    System.out.println(driver.findElement(By.xpath("//input[contains(@type,'te')]")).isDisplayed());
	    
	    //text() + Contains()
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).isDisplayed());
	    
	    //starts-with
	    System.out.println(driver.findElement(By.xpath("//input[starts-with(@name,'user' )]")).isDisplayed());
	    
	    //last()
	    System.out.println(driver.findElement(By.xpath("//td[@class='mouseOut'][last()]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//td[@class='mouseOut'][last()-3]")).isDisplayed()); 
	    
	    //position()
	    System.out.println(driver.findElement(By.xpath("//td[@class='mouseOut'][position()=3]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//td[@class='mouseOut'][3]")).isDisplayed());
	    
	    //indexes()
	    System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//tr[1]")).isDisplayed());
	    
	    //xpath axis-methods --->   following
	   
	    System.out.println(driver.findElement(By.xpath("//input[@name='userName' ]/following::tr[2]")).isDisplayed());
	    
	   
	  
	  //xpath axis-methods --->   following:Sibling
		   
	    System.out.println(driver.findElement(By.xpath("//p//following-sibling::table")).isDisplayed());
	    
	    //xpath axis-methods --->   Preceeding
		   
	    System.out.println(driver.findElement(By.xpath("//input[@name='userName' ]/preceding::tr[2]")).isDisplayed());
	    
	    //xpath axis-methods --->   Preceeding-sibling
		   
	    System.out.println(driver.findElement(By.xpath("//tr[@class='mouseOut'][5]/preceding-sibling::tr[2][@class='mouseOut']")).isDisplayed());
	    
	    //parent 
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Vacations')]/parent::td")).isDisplayed());
	    
	    
	    //Ancestor 
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Vacations')]/ancestor::td")).isDisplayed());   
	  List<WebElement> ancestor=driver.findElements(By.xpath("//a[contains(text(),'Vacations')]/ancestor::td"));
	 System.out.println("********");
	  for(WebElement v:ancestor)
	  {
		  System.out.println(v.getText());
	  }
	  System.out.println("********");
	   
	    
	    //ancestor-or-self   
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Vacations')]/ancestor-or-self::td")).isDisplayed());
	    List<WebElement> anc=driver.findElements(By.xpath("//a[contains(text(),'Vacations')]/ancestor-or-self::td"));
		 System.out.println("********");
		  for(WebElement v:anc)
		  {
			  System.out.println(v.getText());
		  }
		  System.out.println("********");
	    
	      //descendant-or-self
		  System.out.println(driver.findElement(By.xpath("//table/descendant::tr")).isDisplayed());
		  
		  //descendant-or-self  
		  System.out.println(driver.findElement(By.xpath("//table/descendant-or-self::tr")).isDisplayed());
		  

		  //child 
		  System.out.println(driver.findElement(By.xpath("//tr[@class='mouseOut']/child::td")).isDisplayed());
		  
		  //self
		  System.out.println(driver.findElement(By.xpath("//tr[@class='mouseOut']/self::tr")).isDisplayed());
		  
		  
		  
		  //CSS selector
		  System.out.println("************CSS SELECTOR*********");
		  driver.get("https://www.makemytrip.com/");
		  //by id
		System.out.println(driver.findElement(By.cssSelector("#root")).isDisplayed());
		driver.get("http://newtours.demoaut.com/");
		//by class
		System.out.println(driver.findElement(By.cssSelector("td.mouseOut")).isDisplayed());
		//by using tag
		System.out.println(driver.findElement(By.cssSelector("input")).isDisplayed());
		//by using tag and attribute
		System.out.println(driver.findElement(By.cssSelector("input[name='login']")).isDisplayed());
		//direct child
		System.out.println(driver.findElement(By.cssSelector("tr[class='mouseOut']>td")).isDisplayed());
		
		
		//subchild
		System.out.println(driver.findElement(By.cssSelector("tr[class='mouseOut'] td")).isDisplayed());
		
		  
		  
		
		  
		driver.close();

	}

}
