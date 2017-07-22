package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Unit test for simple WebDriverCI.
 */
public class WebDriverTest {
	
	WebDriver driver;
	DesiredCapabilities capabilities;
	String url = "https://www.yahoo.com/";
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WebDriverTest(String testName) {
    }

    public static void main(String[] args) {
    	System.out.println("main for manifest");
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test(enabled = true)
	public void testApp() {
        Assert.assertTrue( 2 == 2 );
    }
    
    @Test(enabled = false)
    public void test001SetUpFF() {
    	 driver = new FirefoxDriver();
    	 driver.get(url);
    }    
    
    @Test(enabled = false)
    public void test002SetUpFF() {
    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
    }
    
    @Test(enabled = false)
    public void test003SetUpFF() {
    	capabilities = DesiredCapabilities.firefox();
    	driver =  new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
 

		driver.quit();
    }
    
    @Test(enabled = true)
    public void test004SetUpFF() {
    	System.setProperty("webdriver.gecko.driver", "/Library/geckodriver");
    	capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
    }
    
    
    
}
