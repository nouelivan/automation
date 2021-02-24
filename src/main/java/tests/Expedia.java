package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
	
	
	@Test
	public void hotelReservation() {
		// 1. Search
		
		// 2. Modify search results page, give criteria
		
		// 3. Analyze the results and make our selection.
		
		// 4. Book Reservation
		
		// 5. Fill out contact / billing
		
		// 6. Get Confirmation
		
	}
	
	@BeforeMethod
	public void setUp() {
		driver = utilities.DriverFactory.open("chrome");
		driver.get("https://www.expedia.com/");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	

}
