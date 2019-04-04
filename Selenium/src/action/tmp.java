
package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tmp {
	public static void main(String[] args) throws Exception

	{

		System.setProperty("webdriver.chrome.driver",

				"./drv/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://in.puma.com/?gclid=EAIaIQobChMIp6Gf-obj3wIVBJSPCh0_RwyMEAAYASAAEgJmM_D_BwE");
//		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/ul/li[4]/a")).click();
//
//		WebElement email = driver.findElement(By.xpath("//input[@id='magestore-sociallogin-popup-email']"));
//
//		email.sendKeys("santhoshmechanical1@gmail.com");
//
//		WebElement pass = driver.findElement(By.xpath("//input[@id='magestore-sociallogin-popup-pass']"));
//
//		pass.sendKeys("17081993Ss.");
//
//		driver.findElement(By.xpath("//button[@id='magestore-button-sociallogin']")).click();

		Actions act = new Actions(driver);

		WebElement men = driver.findElement(By.xpath("//*[@id=\"header-nav\"]/ul/li[1]/a"));

		act.moveToElement(men).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"men-subnav\"]/div/div/div[2]/ul/li[2]/a")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"mp-pusher\"]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/ul/li[3]/a"))
				.click();

		// driver.findElement(By.xpath("//*[@id=\"size_label\"]/div[1]/div[2]")).click();

		// driver.findElement(By.xpath("//span[@id='180~230']")).click();

		// driver.findElement(By.xpath("//div[@class='add-to-cart-buttons
		// at-element-click-tracking']")).click();

		// driver.findElement(By
		// .xpath("//a[@class='skip-link skip-cart
		// skip-active']//span[@class='label'][contains(text(),'Cart')]"))
		// .click();

	}
}
