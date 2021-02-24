package tests;

import org.openqa.selenium.WebDriver;

import pages.ContactPageFactory;

public class ContactFactory {
	
			String firstName = "Ivan";
			String lastName = "Nouel";
			String email = "in@testemail.com";
			String comments = "N/A";
	
			public void contactFormTestPageFactory() {
	
			// 1. Initialize Driver
			WebDriver driver = utilities.DriverFactory.open("chrome");
			driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
			
			
			// 2. Enter Contact Info
			ContactPageFactory contactpage = new ContactPageFactory(driver);
			contactpage.setFirstName(firstName);
			contactpage.setLastName(lastName);
			contactpage.setEmail(email);
			contactpage.setComments(comments);
			
			
			}


}
