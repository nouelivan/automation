package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {

	WebDriver driver;

	public void setFirstName(String firstName) {

		driver.findElement(By.name("first_name")).sendKeys(firstName);
		

	}

	public void setLastName(String lastName) {

		driver.findElement(By.name("last_name")).sendKeys(lastName);
		

	}

	public void setEmail(String email) {

		driver.findElement(By.name("email")).sendKeys(email);
		

	}

	public void setComments(String comments) {

		driver.findElement(By.name("message")).sendKeys(comments);
		

	}
	
	public void clickSubmit() {
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

	// Constructor initializes the state of the driver.
	public ContactPage(WebDriver driver) {

		this.driver = driver;

	}

}
