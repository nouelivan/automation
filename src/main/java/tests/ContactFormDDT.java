package tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(value = Parameterized.class)
public class ContactFormDDT {
	String firstName;
	String lastName;
	String email;
	String comments;
	WebDriver driver;
	
	@Test
	public void contactFormTest() {
		System.out.println("NEW RECORD: " + firstName + " " + lastName + " " + email + " " + comments);
	
		
		// Define Web Elements
		WebElement firstNameElement = driver.findElement(By.name("first_name"));
		WebElement lastNameElement = driver.findElement(By.name("last_name"));
		WebElement emailElement = driver.findElement(By.name("email"));
		WebElement commentsElement = driver.findElement(By.name("message"));
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		
		// Fill Out Form
		firstNameElement.sendKeys(firstName);
		lastNameElement.sendKeys(lastName);
		emailElement.sendKeys(email);
		commentsElement.sendKeys(comments);
		
		// Submit
		submit.click();
		
	
	}
	
	@Before
	public void setUp() {
		driver = utilities.DriverFactory.open("chrome");
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("/Users/anacarrasco/Downloads/UserAccounts.csv");
	}
	
	// Constructor that passes parameters to the test method
	public ContactFormDDT(String firstName, String lastName, String email, String comments) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.comments = comments;
	}

}
