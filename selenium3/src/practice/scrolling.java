package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class scrolling {

	
	
	@Test
	public void scroll()
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.quikr.com/cars/used-cars/all-india");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Recently Posted Ads')]"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		
	}
}
