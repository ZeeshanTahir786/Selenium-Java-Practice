package windowsHandleSSL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conection = (HttpURLConnection) new URL(url).openConnection();
			conection.setRequestMethod("HEAD");
			conection.connect();

			int reponseCode = conection.getResponseCode();
			System.out.println(reponseCode);

			a.assertTrue(reponseCode < 400,
					"The Link with the text " + link.getText() + " is broken with code " + reponseCode);
		}

		a.assertAll();
	}

}
