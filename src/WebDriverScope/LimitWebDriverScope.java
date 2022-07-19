package WebDriverScope;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitWebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		1. Count number of links on page
		System.out.println(driver.findElements(By.tagName("a")).size());

//		2. Count number of links on fooeter section
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

//		3.Count number of links on footer section first column
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

//		4. click on each link in the column and check if the pages are working/opening
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);

			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(2000);
		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
