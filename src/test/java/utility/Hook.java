package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	private static WebDriver driver ;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/victorcarrillo/Victor-Automation/2.drivers/chromedriver");
		   driver = new ChromeDriver();
		   //driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
		
	}
	
	public static WebDriver getDriver(){
		return driver ;
	}
}
