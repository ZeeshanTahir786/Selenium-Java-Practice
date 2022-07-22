package java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		List<String> orignalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(orignalList.equals(sortedList));

	}

}
