package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClk {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://in.puma.com/");
		driver.navigate().to("https://in.puma.com/");
		Actions act = new Actions(driver);
		WebElement rtclk = driver.findElement(By.xpath("//a[contains(.,' KIDS')]"));
		act.contextClick(rtclk).perform();
		Thread.sleep(2000);
//		act.sendKeys("t").click(rtclk).perform(); // wont work
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
}