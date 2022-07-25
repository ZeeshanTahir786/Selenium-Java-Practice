package ReletiveLocators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Import it by hand to use relative operators
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class AboveAndBelow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement nameTextBox = driver.findElement(By.cssSelector("[name='name']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());
//		==========================================================
		WebElement doB = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(doB)).click();

//		=========================================================== 
//		Left of
		WebElement chkText = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(chkText)).click();

//		===========================================================
//		Right of
		WebElement checkBox = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(checkBox)).getText());

	}

}
