package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivsion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/date/dateadd.html");
//1st method
//Select Date using Widget
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='picked-month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr[1]/td[3])[2]")).click();
		driver.findElement(By.xpath("//td[.='15']")).click();
//2nd Method
//Enter date using tab key

//find date element		
		WebElement ele = driver.findElement(By.id("d1"));
		ele.sendKeys("15");
//Enter date using tab key		
		ele.sendKeys(Keys.TAB + "03" + Keys.TAB + "1994" + Keys.ENTER);

	}

}
