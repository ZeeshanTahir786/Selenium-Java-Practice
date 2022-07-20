package ScrollingPerform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
//		Count no. of rows and columns
//		and print second row
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

//		System.out.println(driver.findElements(By.cssSelector("div.left-align [id ='product'] tr")).size());
//		System.out.println(driver.findElements(By.cssSelector("div.left-align [id ='product'] th")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).size());
		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
