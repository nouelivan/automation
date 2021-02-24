package smoketests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
WebDriver driver;
	
	@Test
	public void contactFormElementsPresent() {
		System.out.println("Running Test");
		String webURL = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(webURL);
		
		// We want to test the presence of A tags >> hyperlinks
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		int numberOfAElements = aElements.size();
		System.out.println("There are " + numberOfAElements + " a tags on the page.");
		for (WebElement aElement : aElements) {
			System.out.println(aElement.getText());
		}
		
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
