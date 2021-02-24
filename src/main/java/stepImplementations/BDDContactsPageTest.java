package stepImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BDDContactsPageTest {
	WebDriver driver;
	
	@Given("^user is on the contacts page$")
	public void user_is_on_the_contacts_page() {
		System.out.println("User is on contacts page.");
	
		driver = utilities.DriverFactory.open("chrome");
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
	}
	
	
	@When("^user enters valid info in all required areas$")
	public void user_enters_valid_info_in_all_required_areas() {
		System.out.println("User enters contact info.");
		
		driver.findElement(By.name("first_name")).sendKeys("Ivan");
		driver.findElement(By.name("last_name")).sendKeys("Nouel");
		driver.findElement(By.name("email")).sendKeys("in@testemail.com");
		driver.findElement(By.name("message")).sendKeys("N/A");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	
	@SuppressWarnings("deprecation")
	@Then("^the user gets confirmation$")
	public void user_gets_confirmation() {
		System.out.println("User gets confirmation.");
		
		Assert.assertTrue(driver.getCurrentUrl().contains("you"));
		
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
	}

}
