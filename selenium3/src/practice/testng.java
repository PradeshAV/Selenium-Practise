package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
	
	
	@Test
	public void test1()
	{
		System.out.println("mohan");
	}
	
	
	@BeforeSuite
	public void test2()
	{
		System.out.println("Beforesuite");
	}
	
	
	
	@AfterSuite
	public void test3()
	{
		System.out.println("aftersuite");
		
	}
	
	
	
	@BeforeTest
	public void test4()
	{
		System.out.println("beforetest");
	}
	
	
	@AfterTest
	public void test5()
	{
		System.out.println("aftertest");
	}
	
	
	
	
	
	
	@BeforeClass
	public void test6()
	{
		System.out.println("beforetest");
		
		
		
		
	}
	
	
	
	@AfterClass
	public void test7()
	{
		System.out.println("afterclass");
	}
	

	
	
	@BeforeMethod
	public void test8()
	{
		System.out.println("sanjay");
		
		
		
		
		
	}
@AfterMethod
public void test9()
{
	System.out.println("kumar");
}

}
