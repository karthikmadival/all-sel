package yahoo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drv/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
//	System.setProperty("webdriver.chrome.driver", "./drv/chromeriver.exe");
//	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/account/create?specId=yidReg");
	driver.findElement(By.id("usernamereg-firstName")).sendKeys("Karthik");
	driver.findElement(By.id("usernamereg-lastName")).sendKeys("madival");
	driver.findElement(By.id("usernamereg-yid")).sendKeys("kmadi");
	driver.findElement(By.id("usernamereg-password")).sendKeys("passworD");	
	driver.findElement(By.xpath("//option[@data-code='+91']")).click();		
	driver.findElement(By.id("usernamereg-phone")).sendKeys("9738383742");
//	driver.findElement(By.xpath("//option[.='March']")).click();
	
	
	WebElement ele = driver.findElement(By.id("usernamereg-month"));
	Select drp = new Select(ele);
	drp.selectByIndex(2);
	
	
	driver.findElement(By.id("usernamereg-day")).sendKeys("15");
	driver.findElement(By.id("usernamereg-year")).sendKeys("1994");

	
	
//	driver.findElement(By.xpath("//li[.='Male']")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[6]/ul/li[2]"));
//	driver.findElement(By.id("usernamereg-freeformGender"));
//	driver.findElement(By.xpath("//li[2]"));

//	driver.findElement(By.id("reg-submit-button")).click();

	
}
}
