package addtocart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']")));
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();

		WebElement dropDown = driver.findElement(By.cssSelector("select[data-style='btn-info']"));

		Select option = new Select(dropDown);

		option.selectByVisibleText("Consultant");

		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			System.out.println(name);
			driver.findElements(By.xpath("(//div[@class='card-footer'])/button")).get(i).click();
		}

		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();

	}

}
