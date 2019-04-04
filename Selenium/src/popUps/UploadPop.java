package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("uploadBtnCont")).sendKeys("D:\\SELENIUM\\selenium SCRipt\\html pages\\asdad.docx");
driv.
//		WebElement bt = driver.findElement(By.id("uploadBtnCont"));
//		bt.click();
//		bt.sendKeys("E:\\resumes\\New Microsoft Word Document (2).docx");

	}

}
