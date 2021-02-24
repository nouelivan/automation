package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCheckboxesRadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/anacarrasco/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		// 1.
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		// 2.
		driver.findElement(By.cssSelector("input[type='radio'][value='blue']")).click();
		
		new Select(driver.findElement(By.id("dropdowm-menu-1"))).selectByVisibleText("Python");
		new Select(driver.findElement(By.id("dropdowm-menu-2"))).selectByVisibleText("Maven");
		new Select(driver.findElement(By.id("dropdowm-menu-3"))).selectByVisibleText("JQuery");
		
		driver.findElement(By.cssSelector("input[type='checkbox'][value='option-1']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox'][value='option-3']")).click();
	}

}
