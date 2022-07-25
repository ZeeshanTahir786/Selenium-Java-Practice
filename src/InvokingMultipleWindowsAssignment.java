import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowsAssignment {

	public static void main(String[] args) {
		/*
		 * Invoking Multiple Windows/Tabs from Selenium using one driver Instance
		 * Scenario : Navigate to https://rahulshettyacademy.com/angularpractice/ Fill
		 * the "Name" field with the first course name available at
		 * https://rahulshettyacademy.com
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();

		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(courseName);
		
//		driver.close();
//		driver.quit();
	}

}
