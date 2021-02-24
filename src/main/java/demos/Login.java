package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// 1. Define the web driver.
				System.setProperty("webdriver.chrome.driver", "/Users/anacarrasco/Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				// 2. Open web browser and navigate to page.
				// http://www.webdriveruniversity.com/Login-Portal/index.html
				driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
				
				// Find Elements
				
				// 3. Enter Username
				driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("webdriver");
				
				// 4. Enter Password
				driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("webdriver123");
				
				// 5. Click Login
				driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
				
				// 6. Get confirmation
				Alert alert = driver.switchTo().alert();
				
				String alertMessage = driver.switchTo().alert().getText();
				
				if (alertMessage.equals("validation succeeded")) {
					
					System.out.println("Comfirmation Successful");
					
				}
					
					else {
						System.out.println("Confirmation Unsuccessful");
					}
				
				alert.accept();
				
				// 7. Close the browser
					driver.close();
	
	}

}
