import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'IXC')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'IXC')])")).click();
	}

}
