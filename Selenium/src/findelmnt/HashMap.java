package findelmnt;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./2.45/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\SELENIUM\\selenium SCRipt\\html pages\\ListBox.html");
		LinkedHashMap<String, Integer> st=new LinkedHashMap<String, Integer>();
		WebElement sel = driver.findElement(By.xpath("//select[@id='Multi']"));
		Select s=new Select(sel);
		List<WebElement> od = s.getOptions();

		for (WebElement adrs : od) {
			String aky=adrs.getText();
			if (st.containsKey(aky)) {
				
			}
			st.put("aky", );
		}
		System.out.println(st);
		
	}

}
