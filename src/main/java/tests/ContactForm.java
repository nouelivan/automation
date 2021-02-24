package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.ContactPage;

public class ContactForm {
	
	@Test
	public void contactFormTest() {

		// 1. Initialize Driver
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// 2. Enter contact form info
		ContactPage contactpage = new ContactPage(driver);
		contactpage.setFirstName("Ivan");
		contactpage.setLastName("Nouel");
		contactpage.setEmail("in@testemail.com");
		contactpage.setComments("N/A");
		contactpage.clickSubmit();

		// 3. Get confirmation
		String message = driver.getCurrentUrl();

		if (message.equals("http://www.webdriveruniversity.com/Contact-Us/contact-form-thank-you.html")) {
			System.out.println("Confirmation Successful");
		} else {
			System.out.println("Confirmation Unsuccessful");
		}

		// 4. Close Driver
		driver.quit();

	}

}
