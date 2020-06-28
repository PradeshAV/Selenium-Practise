package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class multiplewindow {
	
	
	
	public static void main(String[] s)
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
	WebDriver driver=new FirefoxDriver(options);
driver.get("http://www.naukri.com/");

String parent=driver.getWindowHandle();
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	while(i1.hasNext())
	{
		String child=i1.next();
		if(!parent.equals(child))
		{
			
			System.out.println(driver.switchTo().window(child).getTitle());
			
		}
	}
	System.out.println(driver.switchTo().window(parent).getTitle());
	}

}
