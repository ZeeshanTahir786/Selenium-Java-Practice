import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStatic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select = new Select(staticDropDown);
		
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("AED");
		System.out.println(select.getFirstSelectedOption().getText());

		
		driver.close();
	}

}
