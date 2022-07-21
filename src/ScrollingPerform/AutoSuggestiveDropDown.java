package ScrollingPerform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("pa");
		Thread.sleep(3000);
		
//		for (int i = 0; i < 3; i++) {
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//		}
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
//		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		

		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		System.out.println(options.size());

//		 for(WebElement option : options) {
//			 if(option.getText().equalsIgnoreCase("pakistan")) {
//				 option.click();
//				 break;
//			 }
//		 }
	}

}
