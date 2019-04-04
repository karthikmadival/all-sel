package puma;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pums {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//mouse hover and selecting sneaker from men
		driver.navigate().to("https://in.puma.com/");
		WebElement menEle = driver.findElement(By.xpath("//a[contains(.,' MEN ')]"));
		Thread.sleep(2000);
		Actions actn = new Actions(driver);
		actn.moveToElement(menEle).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Sneakers'])[3]")).click();
		Thread.sleep(2000);

//select 3rd shoe
//		driver.get("https://in.puma.com/men/shoes/sneakers.html?dir=asc&order=position&in-stock=1#page=1");
		WebElement shoe3 = driver
				.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[3]"));
		shoe3.click();
		WebElement shoe5 = driver
				.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[5]"));
		shoe5.click();
		Thread.sleep(3000);

//get the address of 1st tabs		
//		String MainWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
//get the address of all the tabs
		Set<String> s1 = driver.getWindowHandles();
		for (String k1 : s1) {
			driver.switchTo().window(k1);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("TSUGI NETFIT v2 evoKNIT Men's Sneakers")) {
				break;
			}
		}
//select size 10
		driver.findElement(By.xpath("//div[@class='product-size-click-btn']")).click();
		driver.findElement(By.id("180~71")).click();
//		add to cart
		driver.findElement(By.xpath("//div[@class='add-to-cart-buttons at-element-click-tracking']")).click();

//		size chart
//		driver.findElement(By.xpath("//a[.='Size Chart']")).click();

	}

}
