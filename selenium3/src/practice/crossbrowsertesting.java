package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	
	
	
	
	
	@Test
	@Parameters("browser")
	public void startbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			FirefoxOptions options=new FirefoxOptions();
			options.setCapability("marionette", false);
		WebDriver	driver=new FirefoxDriver(options);
		driver.get("http://facebook.com");
			
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan raji\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://facebook.com");
		}
	}

}
