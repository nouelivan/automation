package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactForm {

	public static void main(String[] args) {
		
		// 1. Create WebDriver
		System.setProperty("webdriver.chrome.driver", "/Users/anacarrasco/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. Navigate to Account Management Page >> Click on Create Account
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// 3. Fill out the form.
		driver.findElement(By.name("first_name")).sendKeys("Ivan");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Nouel");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("test@testemail.com");
		driver.findElement(By.name("message")).sendKeys("N/A");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		// 4. Get confirmation 
		String message = driver.getCurrentUrl();
		
		
		if (message.equals("http://www.webdriveruniversity.com/Contact-Us/contact-form-thank-you.html")) {
			System.out.println("Confirmation Successful");
		} else {
			System.out.println("Confirmation Unsuccessful");
		}
		
		// 5. Close the browser.
		
		driver.close();

	}

}
