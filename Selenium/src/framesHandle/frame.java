package framesHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.puma.com/");
		Thread.sleep(4000);
		driver.switchTo().frame(1);            //travel from parent frame to child frame 
		driver.findElement(By.xpath("//input[@id='__st_bpn_no']")).click();; // ---frame concept
		Thread.sleep(2000);
//		driver.switchTo().defaultContent();    // travel to parent frame
//		driver.switchTo().parentFrame();		//travel from child frame  to immidiate parent frame
		driver.findElement(By.xpath("(//a[contains(.,'KIDS')]")).click();
	
	}
}
