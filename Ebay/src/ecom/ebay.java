package ecom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ebay {
	WebDriver driver;
	
	
	public ebay(WebDriver driver)
	{
		this.driver=driver;
	}
		
		
		
@FindBy(xpath="//div[@id='srp-river-results']/ul/li")//
static		
List<WebElement> allelements;		
		







		public void searchproducts(String products,WebDriver driver,String category) throws InterruptedException
		{
			
			
			driver.findElement(By.id("gh-ac")).sendKeys(products);
			
			Thread.sleep(2000);

			driver.findElement(By.id("gh-cat")).click();
			
			
		WebElement ele=	driver.findElement(By.id("gh-cat"));
			
			Select dropdown=new Select(ele);
			
			dropdown.selectByVisibleText(category);
			
			driver.findElement(By.id("gh-btn")).click();
		}
		
		
		
		
		
			
			
			
		public  void getallproducts(WebDriver driver)
		{
			System.out.println("The prices of the watches are");
			double a2;
			
		for(WebElement sproducts:allelements)//no.of watches in page
			{
				int x1=sproducts.getLocation().x;
				int y1=sproducts.getLocation().y;
				scrollto(x1,y1,driver);
			List<WebElement> l1=sproducts.findElements(By.xpath("//span[@class='s-item__price']"));
			System.out.println("watches are present"+l1.size() );
			for(int i=0;i<l1.size();i++)//each 
			{	
			String a[]=new String[l1.size()];
			
			  a[i]=l1.get(i).getText();
	          a[i]=a[i].replaceAll("([A-Z])", "");
			  a[i]=a[i].trim();
			  a[i]=a[i].replaceAll(",", "");
		
			  a2=Double.parseDouble(a[i]);
	          System.out.println(a2);
	          if(a2>1500)
	          {
	        	  System.out.println("The largest price of watch is "  + a2);
	          }
	          
	            
			}

break;
			}	
	
		}
		
	

		
	
		
		public static void scrollto(int x1,int y1,WebDriver driver)
		{

			String jsCommand;
			JavascriptExecutor je;
			
			je = (JavascriptExecutor) driver;
			
			jsCommand = String.format("window.scrollTo(%d,%d)", x1, y1);
			
			je.executeScript(jsCommand);
			
			
		}	
	}





