package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Quickr {

	
	
@Test
public void quickrapp()
{
	
	WebDriver driver=startbrowser.start("firefox");
	          quickr1 p= PageFactory.initElements(driver, quickr1.class);
	          p.getallcars();
	        
	          
	
	
}
	
	
	
	
	
}
