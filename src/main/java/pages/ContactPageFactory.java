package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageFactory {
	// Define WebElements at class level.
	
	WebDriver driver;
	
	@FindBy(name="first_name")
	WebElement firstNameBox;
	
	@FindBy(name="last_name")
	WebElement lastNameBox;
	
	@FindBy(name="email")
	WebElement emailBox;
	
	@FindBy(name="message")
	WebElement commentsBox;

	// Steps
	public void setFirstName(String firstName) {

		firstNameBox.sendKeys(firstName);
		

	}

	public void setLastName(String lastName) {

		lastNameBox.sendKeys(lastName);
		

	}

	public void setEmail(String email) {

		emailBox.sendKeys(email);
		

	}

	public void setComments(String comments) {

		commentsBox.sendKeys(comments);
		

	}
	
	public void clickSubmit() {
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	
	// Actions
	public void contact(String firstName, String lastName, String email, String comments) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setComments(comments);
		
	}

	// Constructor initializes the state of the driver.
	public ContactPageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	

}
