package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple WebDriverCI.
 */
public class WebDriverTest
{
	
	WebDriver driver;
	String url = "https://www.yahoo.com/";
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WebDriverTest(String testName) {
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp() {
        Assert.assertTrue( 2 == 2 );
    }
    
    @Test
    public void test001SetUpFF() {
    	 driver = new FirefoxDriver();
    	 driver.get(url);
    }
    
}
