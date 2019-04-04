package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmPop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("D://SELENIUM/selenium SCRipt/html pages/allSelCon.html");
//double click using Actions class	 
//Alert PopUps		
		WebElement dblclk = driver.findElement(By.id("dblClkBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(dblclk).perform();
		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
// Confirmation Alert PopUps		
		driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
		Thread.sleep(2000);
		alrt.accept();
//		alrt.dismiss();
	}

}
