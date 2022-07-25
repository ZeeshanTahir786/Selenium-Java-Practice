import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowsAssignment {

	public static void main(String[] args) throws IOException {
		/*
		 * Invoking Multiple Windows/Tabs from Selenium using one driver Instance
		 * Scenario : Navigate to https://rahulshettyacademy.com/angularpractice/ 
		 * Fill the "Name" field with the first course name available at
		 * https://rahulshettyacademy.com
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();

		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);

		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();

		driver.switchTo().window(parentId);
		WebElement name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		name.sendKeys(courseName);
		
//		============================================
//		taking screenshot of specific Web element
		File src = name.getScreenshotAs(OutputType.FILE);

//		FileUtils.copyFile(src, new File("nameField.png"));

//		=================================================
//		Get the height and width of specific web element
		
		System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
		
//		driver.close();
//		driver.quit();
	}

}
