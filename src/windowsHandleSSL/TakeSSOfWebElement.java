package windowsHandleSSL;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeSSOfWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {

//		Download FileUtils jar externaly Link: https://commons.apache.org/proper/commons-io/
//		Add jars by right click on project go to properties and click java build path and clcik add external jars.

		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com");
		Thread.sleep(3000);
		WebElement icon = driver.findElement(By.className("subscribe-style-one"));
		File src = icon.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("footer.png"));

	}

}
