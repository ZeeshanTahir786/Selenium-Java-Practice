package windowsHandleSSL;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleHttpSites {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

//		FirefoxOptions option1 = new FirefoxOptions();
//		EdgeOptions option2 = new EdgeOptions();
		options.addExtensions(new File("/path/to/extension.crx")); // to add extention on chrome in runtime

		// Add the WebDriver proxy capability.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);

//		Block pop-up windows
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

//		Set download directory path
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
