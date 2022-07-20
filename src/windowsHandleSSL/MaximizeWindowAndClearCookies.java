package windowsHandleSSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndClearCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // for maximizing the window
		
		driver.manage().deleteAllCookies(); // for delete all cookies
		driver.manage().deleteCookieNamed("sessionkey"); // for delete specific named cookie

//		When we delete the session cookie the application should move you to the login stage. How we validate this?
//		Step 1. driver.manage().deleteCookieNamed("sessionkey");
//		Step 2. Click on any link on the page
//		Step 3. Login Page - Verify login url
		
		
		driver.get("https://google.com");

	}

}
