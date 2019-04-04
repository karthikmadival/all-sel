package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
/*
		 * //TYPE CASTING FROM WebDriver to TakeScreenshot Interface
		TakesScreenshot ts = (TakesScreenshot) driver;
//TAKING Screenshot and store it in temp folder
		File src = ts.getScreenshotAs(OutputType.FILE);
//Creating Destination folder to save image
		File dst = new File("D:\\act.jpeg");
//Copying Screenshot from temp folder to destination		
		FileUtils.copyFile(src, dst);

*/

		Date d = new Date();
		String s2 = d.toString();
		String s3= s2.replaceAll(":", "_");
		TakesScreenshot shot = (TakesScreenshot) driver;
		for (int i = 0; i < 2; i++) {
			Thread.sleep(1000);

			File tmp = shot.getScreenshotAs(OutputType.FILE);
			File hdd = new File("D:\\act"+s3+".jpeg");
			FileUtils.copyFile(tmp, hdd);	
		}
		

	}

}
