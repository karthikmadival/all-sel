package select_nd_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tsel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:/SELENIUM/selenium SCRipt/html pages/comboBox.html");
		WebElement sd=driver.findElement(By.id("programmoduleselect"));
		sd.click();
		Select sel=new Select(sd);
		sel.selectByIndex(4);
	}

}
