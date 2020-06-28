package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class quickr1 {
	
	WebDriver driver;
	public quickr1(WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(xpath = "//*[contains(@class,'qc-carousel__item')]") 
	@CacheLookup
	List<WebElement> allElements;



public  void getallcars()
{
	int total=allElements.size();
	System.out.println("Total Number of cars" +total);
	for(int i=0;i<total;i++)
	{
		String value=allElements.get(i).findElement(By.className("qc-ads__card--body footerSection")).getText();
	driver.navigate().back();
	//String details=value.getText();
	System.out.println("details of car"+ "-" +value);
	
	
	}
	}
	
	


public  void displaylargerstpricecar()
{
	
}






/*for(int j=1;j<total;j++)
{
String value1=allElements.get(j).findElement(By.xpath("//*[contains(@class,'price')]")).getText();
if(value.eq(value1))
{
	
}*/
	
}
