package action;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Composit {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://in.puma.com/");
		driver.navigate().to("https://in.puma.com/");
		Actions act=new Actions(driver);
		WebElement rtclk = driver.findElement(By.xpath("//a[contains(.,' KIDS')]"));
		Thread.sleep(3000);
//	composite action
		rtclk.sendKeys(Keys.CONTROL+""+Keys.ENTER);
//   or
//		act.sendKeys(Keys.SHIFT).click(rtclk).perform();

	}

}
