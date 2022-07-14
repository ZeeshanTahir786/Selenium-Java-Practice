import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hafizzeeshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://www.spicejet.com/");
//		
//		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
//		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());
//		
//		
//		for (int i = 1; i < 5; i++) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//		}
//		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());

		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@id='divAdult']//div[@class='ad-row-right']/span[3]")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
