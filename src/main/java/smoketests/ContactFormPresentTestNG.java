package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactFormPresentTestNG {
	WebDriver driver;
	
	@Test
	public void contactFormElementsPresent() {
		System.out.println("Running Test");
		String webURL = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(webURL);
		
		boolean firstName = driver.findElement(By.name("first_name")).isDisplayed();
		boolean lastName = driver.findElement(By.name("last_name")).isDisplayed();
		boolean email = driver.findElement(By.name("email")).isDisplayed();
		boolean comments = driver.findElement(By.name("message")).isDisplayed();
		
		Assert.assertTrue(firstName);
		Assert.assertTrue(lastName);
		Assert.assertTrue(email);
		Assert.assertTrue(comments);
		
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Initializing Driver");
		driver = utilities.DriverFactory.open("chrome");
		
		
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing Driver");
		driver.close();
		
	}
	
}
