package javascripececutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drv/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		for (int i = 0; i < 3; i++) {
			js.executeScript("window.scrollBy(0,500)");

		}

		WebElement eel = driver.findElement(By.xpath("(//h2[@class='puxlXr'])[4]"));
		Point loc = eel.getLocation();
		int v = loc.getX();
		System.out.println(v);
		int i = loc.getY();
		System.out.println(i);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(" + v + "," + i + ")");
	    
	}

}
