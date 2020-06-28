package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookexcel {
	
	
	@Test(dataProvider="data")
	public void verifydata(String email,String pass)
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
	WebDriver	 driver = new FirefoxDriver(options);
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("user")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	@DataProvider(name="data")
	public Object[][] senddata()
	{
	Datadrivenexcel config=new Datadrivenexcel("D:\\workplace\\selenium3\\demo.xlsx");
	int rows=config.getrownum(0);
	Object[][] passdata=new Object[rows][2];
	for(int i=0;i<rows;i++)
	{
		
		passdata[i][0]=config.getdata(0, i, 0);
	passdata[i][1]=	config.getdata(0, i, 1);
	}
		
	return passdata;	
	}

}
