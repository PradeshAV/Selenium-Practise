package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	
	
	public static void main(String[] s)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	WebDriver w = new FirefoxDriver();
	w.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	w.manage().window().maximize();
	Actions act=new Actions(w);
WebElement ele=	w.findElement(By.xpath("//div[@class='dropdown-content']/a"));
act.moveToElement(ele).perform();	
List<WebElement> links=	w.findElements(By.xpath("//div[@class='dropdown-content']/a"));
int total=links.size();
System.out.println(total);
for(int i=0;i<total;i++)
{
WebElement ele1	=links.get(i);
String text=ele1.getText();
System.out.println(text);
if(text.equalsIgnoreCase("selenium"))
{
	ele1.click();
}
}

		
	
	}

}
