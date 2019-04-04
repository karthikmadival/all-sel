package findelmnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./2.45/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\SELENIUM\\selenium SCRipt\\html pages\\ListBox.html");
		WebElement lb = driver.findElement(By.xpath("//select[@id='Multi']"));
		Select sel = new Select(lb);

		sel.selectByIndex(0);
		sel.selectByValue("4");
		sel.selectByVisibleText("Python");
		sel.selectByVisibleText("Java");
		System.out.println(sel.isMultiple());
		if (sel.isMultiple()) {
			sel.deselectByIndex(0);
			sel.deselectByValue("4");
			sel.deselectByVisibleText("Java");
			Thread.sleep(1000);
			sel.deselectAll();
		}
		List<WebElement> go = sel.getOptions();
		int count = go.size();
		System.out.println(count);
		for (WebElement w : go) {
			System.out.println(w.getText());
		}
	}
}
