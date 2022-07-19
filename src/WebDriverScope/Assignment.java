package WebDriverScope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) {
//		1.select any checkbox 
//		2. Grab the label of the selected checkbox //put into variable
//		3. Select an option in dropdown. Here option to select should come from step 2 // Do not hard code text.drive it dynamically from step 2 
//		4. enter the step 2 grabbed label text in Editbox //
//		5.Click Alert and then verify if text grabbed from step 2 is present in the pop up message
//		do not hardcode the label part.
		
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String checkBoxText = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		driver.findElement(By.id("checkBoxOption2")).click();

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		
		Select options = new Select(dropDown);
		
		options.selectByVisibleText(checkBoxText);
		
		driver.findElement(By.id("name")).sendKeys(checkBoxText);
		driver.findElement(By.id("alertbtn")).click();
		if(driver.switchTo().alert().getText().contains(checkBoxText)) {
			Assert.assertTrue(true);
			driver.switchTo().alert().accept();
		}
	}

}
