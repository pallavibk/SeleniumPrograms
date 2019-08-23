package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	
	public void radiomethod(WebDriver driver,String param1,String param2) throws InterruptedException
	{
		List<WebElement> Allradios= driver.findElements(By.name(param1));
		for(int i=0;i<Allradios.size();i++)
		{System.out.println(Allradios.get(i).getAttribute("value"));
		}
		
		for(int i=0;i<Allradios.size();i++)
		{
			
			if(Allradios.get(i).getAttribute("value").equals(param2))
			{Thread.sleep(2000);
				Allradios.get(i).click();
			}
		}
	}
	
	public void checkboxmethod(WebDriver driver,String param1,String param2) throws InterruptedException
	{
		List<WebElement> checkbox=driver.findElements(By.name(param1));
		for(int i=0;i<checkbox.size();i++)
		{
			if(checkbox.get(i).getAttribute("value").equals(param2))
			{
				checkbox.get(i).click();
			}
		}
	}	

		
			 
			 
	public void DropDown__method(WebDriver driver,String param,WebElement param1,String param2,int param3) throws InterruptedException
	{
		Select DD=new Select(param1);
		List<WebElement> options=DD.getOptions();
		if(param.equals("selectByVisibleText"))
		{
			DD.selectByVisibleText(param2);
		}
		if(param.equals("selectByIndex"))
		{
			DD.selectByIndex(param3);
		}
		if(param.equals("selectByIndex"))
		{
			DD.selectByIndex(param3);
		}
		if(param.equals("selectByValue"))
		{
			DD.selectByValue(param2);
		}
		if(param.equals("deselectByVisibleText"))
		{
			DD.deselectByVisibleText(param2);
		}
		if(param.equals("deselectByIndex"))
		{
			DD.deselectByIndex(param3);
		}
		if(param.equals("deselectByValue"))
		{
			DD.deselectByValue(param2);
		}
	
		
		
		
		
		
		//to get the first selected optiuons
				WebElement firstele=DD.getFirstSelectedOption();
				System.out.println("firstele="+firstele.getText());
				
				//to print all
				for(WebElement v:options)
				{
					System.out.println("all options="+v.getText());
					
				}
}
	
 
	public void Bootstrap_DD_method(WebDriver driver,WebElement param1,String param2) throws InterruptedException
	{
	
		param1.click();	
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath(param2));
		 for (WebElement ele : list)
		{
			 System.out.println("Values " + ele.getAttribute("innerHTML"));
			 if (ele.getAttribute("innerHTML").contains("JavaScript")) {
				 
   	             ele.click();
             break;

      }
		}
	}
	
}





