package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJUnit {
	// Declare variables and objects at CLASS level in order to access in multiple methods.
	WebDriver driver;
	String webURL = "http://www.webdriveruniversity.com/";

	@Test
	public void pageTitleTest() {
		System.out.println("Running the test");
		driver.get(webURL);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Initializing the driver");
		driver = utilities.DriverFactory.open("chrome");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing the driver");
		driver.close();
	}
	
}
