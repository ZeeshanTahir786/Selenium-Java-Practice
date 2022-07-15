import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdwonAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("hafiz zeeshan");
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc0987644W3");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select option = new Select(dropDown);
		
		option.selectByVisibleText("Female");
		
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("02/08/2021");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText(), "×\n"
				+ "Success! The Form has been submitted successfully!.");
		
		
//		driver.close();
		
	}

}
