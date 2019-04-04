package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jobong {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jabong.com");
		
		WebElement sp = driver.findElement(By.xpath("//a[contains(.,' sports  ')]"));
		Actions act=new Actions(driver);
		act.moveToElement(sp).perform();
		
		driver.findElement(By.xpath("(//a[.='Adidas'])[1]")).click();
		String tit = driver.getTitle();
		System.out.println(tit);

	}

}
