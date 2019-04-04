
package javascripececutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\SELENIUM\\selenium SCRipt\\html pages\\Disabled.html");
//TYPE CASTING from driver to  JavaScriptExecutor	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
//SENDING VALUE TO DISABLED TEXT	    
		js.executeScript("document.getElementById('t1').value='456'");
	}
}
