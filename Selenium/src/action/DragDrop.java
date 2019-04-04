package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./drv/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("D://SELENIUM/selenium SCRipt/html pages/had.html");
		WebElement img = driver.findElement(By.xpath("//img[@id='sourceImage']"));
		WebElement blck = driver.findElement(By.xpath("//div[@id='block']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(img, blck).perform();
		
		drv.

	}
}
