package java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchAndFilterResult {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");

		List<WebElement> result = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> filteredResult = result.stream().filter(r -> r.getText().contains("Rice"))
				.collect(Collectors.toList());
		
		Assert.assertEquals(result.size(), filteredResult.size());
		
//		For calculating the price of searched prod
		List<String> filteredPriceResult = filteredResult.stream().map(a -> getPrice(a))
				.collect(Collectors.toList());
		filteredPriceResult.forEach(a -> System.out.println(a));
	}

	private static String getPrice(WebElement a) {
		String price = a.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
