package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//explict wating Time delay
		WebDriverWait wt = new WebDriverWait(driver, 10);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://in.puma.com");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement menEle = driver.findElement(By.xpath("//a[contains(.,' MEN ')]"));
		Actions actn = new Actions(driver);
		actn.moveToElement(menEle).perform();
		WebElement re = driver.findElement(By.xpath("(//a[.='Sneakers'])[3]"));
//explct delay		
		wt.until(ExpectedConditions.visibilityOf(re));
		re.click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(.,'Home')]")).click();
//explct delay		
		wt.until(ExpectedConditions.titleContains("Forever"));
		String tit = driver.getTitle();
		System.out.println(tit);
//explct delay				
		WebDriverWait wat = new WebDriverWait(driver, 10);		
		WebElement as = driver.findElement(By.xpath("//a[.='Customer Service']"));
		ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(as);
		wat.until(condition);
		as.click();
		System.out.println(driver.getTitle());

	}

}
