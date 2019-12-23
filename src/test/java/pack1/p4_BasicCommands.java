package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_BasicCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("current URL="+driver.getCurrentUrl());
		driver.get("http://newtours.demoaut.com/");
		
		//3
		 System.out.println("Current URL="+driver.getCurrentUrl());
		 
		 //4
	       System.out.println("Title="+driver.getTitle());
	       
	       //5 
	        System.out.println("Page source="+driver.getPageSource());
	        
	    
	     //8
	     System.out.println("*******************");
	     System.out.println( driver.findElement(By.name("login")).getAttribute("value")); 
	     System.out.println( driver.findElement(By.name("login")).getText());
	     System.out.println( driver.findElement(By.name("login")).getAttribute("name")); 
	     System.out.println( driver.findElement(By.name("login")).getAttribute("type"));
	     System.out.println( driver.findElement(By.name("login")).getAttribute("alt"));
	     System.out.println( driver.findElement(By.xpath("//a[ contains(text(),'REGISTER')]")).getText());
	
	  
	 
	 
	      

	        //program to understand exit() and close()
	        //6 
	 	    driver.close();
	 	    
	 	    //7
	 	   // driver.exit();
		

	}

}
