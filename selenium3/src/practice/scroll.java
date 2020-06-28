package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class scroll {

	static WebDriver driver;
	
	public static void main(String [] s) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", readfile("path"));
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		 driver=new FirefoxDriver(options);
		driver.get(readfile("url"));
		JavascriptExecutor je;
		je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");

	}


	public static String readfile(String property) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\webelement1.properties");
		pro.load(fis);
		return(pro.getProperty(property));
	}


}

