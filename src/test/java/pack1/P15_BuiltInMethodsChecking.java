package pack1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class P15_BuiltInMethodsChecking {

	public static void main(String[] args) {
		
		
		// SearchContext obj= new SearchContext();
				// SearchContext obj1= new WebDriver();
				
				// WebDriver obj3= new RemoteWebDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver obj555 = new ChromeDriver();//only ebdriver
		RemoteWebDriver obj55 = new ChromeDriver();//only remoteedriver
		ChromeDriver obj5 = new ChromeDriver();//remoteebdriver+CD
		TakesScreenshot obj9 = new ChromeDriver();//only takescreenshot
		
	JavascriptExecutor obj10 = new ChromeDriver();//only javascriptexecutor methods
	SearchContext obj12 = new ChromeDriver();//only searchcontext methds
	

	

        RemoteWebDriver obj6 = new FirefoxDriver();
    	//WebDriver obj4= new RemoteWebDriver();

		// RemoteWebDriver obj4= new RemoteWebDriver();
     // TakesScreenshot obj7=new RemoteWebDriver();
     		// JavascriptExecutor obj8=new RemoteWebDriver();
     // SearchContext obj2= new RemoteWebDriver();

	}

}
