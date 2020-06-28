package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class objectrepository {

	static WebDriver driver;
	
	public static void main(String [] s) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", readfile("path"));
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		 driver=new FirefoxDriver(options);
		driver.get(readfile("url"));
		objectrepository.capture("home");
	}
	
	
	
	public static String readfile(String property) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\webelement1.properties");
		pro.load(fis);
		return(pro.getProperty(property));
	}
	
	public static void capture(String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("./screen/"+ name+".png"));	
	}
}
