package popUps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPop {

	public static void main(String[] args) throws InterruptedException, IOException {
//		Runtime.getRuntime().exec("C:\\Users\\chethan\\Desktop\\cal.exe");
		System.setProperty("webdriver.gecko.driver", "./drv/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//download ver3.141.59		
		driver.navigate().to("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D://SELENIUM/selenium SCRipt/html pages/PopWindow.exe");
//Download ver
//		driver.findElement(By.xpath("(//a[.='Download'])[2]")).click();
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec("D://SELENIUM/selenium SCRipt/html pages/DOWN.exe");
//		
	
	
	}
}
