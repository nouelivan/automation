package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	// This method will return a WebDriver object
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/anacarrasco/Drivers/chromedriver");
			return new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "/Users/anacarrasco/Drivers/geckodriver");
			return new FirefoxDriver();
		}
	
	}

}
