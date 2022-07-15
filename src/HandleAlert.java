import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleAlert {

	public static void main(String[] args) {
		String name = "Hafiz Zeeshan";
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
/*		String text = driver.switchTo().alert().getText();
		System.out.println(text);
//		Hello Hafiz Zeeshan, share this practice page and share your knowledge
		String[] splitedText = text.split(",");
//		Hello Hafiz Zeeshan
		System.out.println(splitedText[0].split("o ")[1]);
//		Hafiz Zeeshan
		Assert.assertEquals(splitedText[0].split("o ")[1], name); */
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}

}
