package java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPriceOfElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//		CAPTURE All elements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		List<String> price = elementsList.stream().filter(a -> a.getText().contains("Rice")).map(s -> getPrice(s))
				.collect(Collectors.toList());

		price.forEach(s -> System.out.println(s));

	}

	private static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
