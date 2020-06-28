package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class links {

	
	public static void main(String[] s) throws IOException
	
	{
		
		System.setProperty("webdriver.gecko.driver", " ");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver=new FirefoxDriver(options);
		driver.get("http://facebook.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int total=links.size();
		for(int i=0;i<total;i++)
		{
			WebElement ele=links.get(i);
		String link=ele.getAttribute("href");
		verifylinkactive(link);
		}
		
	}
	public static void verifylinkactive(String linkurl) throws IOException
	{
		
		URL url=new URL(linkurl);
		HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
		httpurlconnect.connect();
		httpurlconnect.setConnectTimeout(3000);
		
	if(httpurlconnect.getResponseCode()==200)
	{
		System.out.println(linkurl+"-"+httpurlconnect.getResponseMessage());
		
		
	}
		
	if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println("linkurl"+"-"+httpurlconnect.getResponseMessage());
	}
				
	}
}
