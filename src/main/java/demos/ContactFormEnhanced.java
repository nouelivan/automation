package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormEnhanced {

	public static void main(String[] args) {
		
		String firstName = "Ivan";
		String lastName = "Nouel";
		String email = "test@testemail.com";
		String comments = "N/A";
		String browserType = "chrome";
		WebDriver driver;
		
		
		
		
		// 1. Open browser and navigate to Account Management Page >> Click on Create Account
				driver = utilities.DriverFactory.open(browserType);
				
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				

				// Define web elements 
				WebElement fName = driver.findElement(By.name("first_name"));
				WebElement lName = driver.findElement(By.name("last_name"));
				WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
				WebElement comment = driver.findElement(By.name("message"));
				WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
				
				
				// 2. Fill out the form.
				fName.sendKeys(firstName);
				lName.sendKeys(lastName);
				emailAddress.sendKeys(email);
				comment.sendKeys(comments);
				submit.click();
				
				// 3. Get confirmation 
				String message = driver.getCurrentUrl();
				
				
				if (message.equals("http://www.webdriveruniversity.com/Contact-Us/contact-form-thank-you.html")) {
					System.out.println("Confirmation Successful");
				} else {
					System.out.println("Confirmation Unsuccessful");
				}
				
				// 4. Close the browser.
				
				driver.close();

	}

}
