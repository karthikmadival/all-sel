package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
//Alert is an interface		
		Alert al = driver.switchTo().alert();
//		Thread.sleep(3000);
		System.out.println(al.getText());
//dismiss() works same as accept()
		Thread.sleep(3000);
		al.dismiss();
//NoAlertPresentException bcz we are using accept() after closing the alert	popup
//		al.accept();

	}

}
