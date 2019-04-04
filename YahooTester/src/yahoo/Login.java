package yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drv/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("karthikmadival");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(6000);
		if (driver.getTitle().equals("Yahoo")) {
			System.out.println("displayd");
		}
		driver.findElement(By.id("login-passwd")).sendKeys("9738383742");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(6000);
		if (driver.getTitle().contains("Yahoo")) {
			System.out.println("dsplyd");

		}

	}

}
