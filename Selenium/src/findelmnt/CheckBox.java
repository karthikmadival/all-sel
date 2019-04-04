package findelmnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.get("D:\\SELENIUM\\selenium SCRipt\\html pages\\CheckBox .html");
		List<WebElement> c = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (WebElement wb : c) {
			wb.click(); 
		}
		int count=c.size();
		for (int i = count-1; i >=0  ; i--) {
			c.get(i).click();
		}
		
	}
}
