package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class startbrowser {
	
	
	static WebDriver driver;
	public static WebDriver start(String browsername)
	{
		
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
			 driver = new FirefoxDriver(options);
			
			driver.get("http://www.ebay.in");
		}
	
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan raji\\Desktop\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://www.ebay.in");
		}
	return driver;
	}

}
