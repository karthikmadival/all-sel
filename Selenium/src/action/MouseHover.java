package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.puma.com/");
		driver.get("https://in.puma.com/");
		WebElement menEle = driver.findElement(By.xpath("//a[contains(.,' MEN ')]"));
		Thread.sleep(3000);
		Actions actn = new Actions(driver);
		actn.moveToElement(menEle).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='Sneakers'])[3]")).click();
		
	}
}
