package amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Aamazon {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trusack bag");
		// driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		// driver.findElement(By.xpath("(//div[@class='s-item-container'])[5]")).click();
		WebElement ele = driver.findElement(By.id("nav-link-shopall"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[.=\"Men's Fashion\"])[1]")).click();
		driver.findElement(By.xpath("(//span[.='Shirts'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='aok-block aok-nowrap aok-hide-text acs_product-image'])[6]")).click();

		Set<String> dft = driver.getWindowHandles();
		for (String ft : dft) {
			driver.switchTo().window(ft);
		}
		WebElement rty = driver.findElement(By.id("native_dropdown_selected_size_name"));
		// Thread.sleep(3000);
		Select slt = new Select(rty);
		Thread.sleep(3000);
		slt.selectByIndex(1);
		Thread.sleep(3000);

		driver.findElement(By.id("add-to-cart-button")).click();
		
	}
}
