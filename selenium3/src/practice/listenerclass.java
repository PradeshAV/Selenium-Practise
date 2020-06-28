package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class listenerclass {

	
	
	@Test
	public void verify()
	{
		Assert.assertEquals(12, 12);
	}
	
	
	@Test
	public void verify1()
	{
		Assert.assertTrue(false);
	}
}
