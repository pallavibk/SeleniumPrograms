package pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_CountNoOfLinkInaPage_VerifyBrokenLink {

	public static void main(String[] args) {
		System.out.println("shri sai");
		System.out.println("OMsai");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\somapurshiva\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.softwaretestingmaterial.com");

		//Count all links in a page
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		//find broken link
		
		for(int i=0;i<alllinks.size();i++)
		{
			WebElement ele=alllinks.get(i);
			//System.out.println(ele);
			//By using "href" attribute, we could get the url of the requried link
			String url=ele.getAttribute("href");
			VerifyURL(url);
		}
		
	}
	 // The below function verifyLink(String urlLink) verifies any broken links and return the server status.
	public static void VerifyURL(String url)
	{
		//Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
		try {
			//Use URL Class - Create object of the URL Class and pass the urlLink as parameter
			URL link=new URL(url);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection  httpconn=(HttpURLConnection)link.openConnection();
			 //Set the timeout for 2 seconds
			httpconn.setConnectTimeout(3000);
			 //connect using connect method
			httpconn.connect();
			//use getResponseCode() to get the response code. 
			//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			if(httpconn.getResponseCode()==200)
			{
				System.out.println(url+"="+httpconn.getResponseMessage());
			}
			else if(httpconn.getResponseCode()==400)
			{
				System.out.println(url+"="+httpconn.getResponseMessage());
			}
			else if(httpconn.getResponseCode()==401)
			{
				System.out.println(url+"="+httpconn.getResponseMessage());
			}
			else if(httpconn.getResponseCode()==404)
			{
				System.out.println(url+"="+httpconn.getResponseMessage());
			}
			else if(httpconn.getResponseCode()==500)
			{
				System.out.println(url+"="+httpconn.getResponseMessage());
			}
		}
		catch (Exception e) {
			 //e.printStackTrace();
			 }
	}
}
