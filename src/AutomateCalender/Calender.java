package AutomateCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
//		21 nov
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class*='datepicker-switch']"))
				.getText().contains("Nov")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}

		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();

			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
