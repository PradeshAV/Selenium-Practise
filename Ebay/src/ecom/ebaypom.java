package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ebaypom 
{
	@Test
	public void getwatchesprices() throws InterruptedException
	{
		
   WebDriver driver=startbrowser.start("Chrome");
   ebay e=PageFactory.initElements(driver,  ebay.class);
  e.searchproducts("fastrack watches", driver,"All Categories");
 e.getallproducts(driver);
		
	}
	

}
