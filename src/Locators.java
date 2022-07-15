import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String name = "Hafiz";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Jon@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("03222292288");
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//form/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class=login-container] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

		
		
//		driver.close();
		
	}

}
