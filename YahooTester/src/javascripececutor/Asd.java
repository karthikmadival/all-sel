package javascripececutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/jeans");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			js.executeScript("Window.scrollBy(0,500)");	
		}
	}

}
