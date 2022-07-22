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

//		CAPTURE All elements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
//		Capture TEXT of all elements into orignal List
		List<String> orignalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
//		Sort on orginal lIst of step 3 -> sorted list
		List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());
//		Compare original vs sorted list
		Assert.assertTrue(orignalList.equals(sortedList));

	}

}
