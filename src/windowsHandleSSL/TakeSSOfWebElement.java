package windowsHandleSSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSSOfWebElement {

	public static void main(String[] args) {
		
//		Download FileUtils jar externaly Link: https://commons.apache.org/proper/commons-io/
//		Add jars by right click on project go to properties and click java build path and clcik add external jars.
		
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

}
