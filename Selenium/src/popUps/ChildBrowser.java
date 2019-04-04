package popUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
//get parent windows id		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
//Store all windows id in Set collection
		Set<String> s1 = driver.getWindowHandles();
//to handle child browser	
		for (String winds : s1) {
			driver.switchTo().window(winds);
			System.out.println(winds);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}

	}

}
