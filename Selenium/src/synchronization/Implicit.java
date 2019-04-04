package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
//Launching Browser		
		WebDriver driver = new ChromeDriver();
//implicit synchronization		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Entering URL using navigate Key
		driver.navigate().to("https://in.puma.com/");
		WebElement menEle = driver.findElement(By.xpath("//a[contains(.,' MEN ')]"));
//Thread.sleep(2000);
		Actions actn = new Actions(driver);
		actn.moveToElement(menEle).perform();
//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Sneakers'])[3]")).click();
//Thread.sleep(2000);
		WebElement shoe3 = driver
				.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[3]"));
		shoe3.click();
		WebElement shoe5 = driver
				.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[5]"));
		shoe5.click();

	}

}
