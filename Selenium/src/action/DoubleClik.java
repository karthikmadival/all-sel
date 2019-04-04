package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClik {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D://SELENIUM/selenium SCRipt/html pages/allSelCon.html");
		WebElement dclk = driver.findElement(By.xpath("//button[.='Double click']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(dclk).perform();;
	}

}
