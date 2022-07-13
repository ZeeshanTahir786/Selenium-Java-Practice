import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfIntro {

	public static void main(String[] args) {
		//Invoking Browser
		// Chrome - ChromeDriver exten->Methods close get 
		// Firefox- FirefoxDriver ->methods close get 
		// safari SaariDrier ->methods close get 
		// WebDriver close get //WebDriver methods + class methods 
		// chromedriver.exe-> Chrome browser
		
		
		
		
		
//		ChromeDriver driver = new ChromeDriver(); // driver object here has access to all the methods of Chrome driver
//		WebDriver driver = new ChromeDriver(); // driver object here has access to the methods of Chrome driver which are defined in web Driver Interface
		
		
//		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "/Users/hafizzeeshan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();


		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		driver.close();
		
	}

}
