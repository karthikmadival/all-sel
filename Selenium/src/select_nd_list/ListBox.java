package select_nd_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dotnetfunda.com/tutorials/controls/listbox.aspx");
//select 2nd listBox option 
		WebElement el = driver.findElement(By.id("PlaceHolderForContents_dropRuntime"));
		el.click();
		Select sele = new Select(el);
//we are using id locator so index start from 0
		sele.selectByIndex(0);

//select 3rd listBox options 		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"PlaceHolderForContents_dropDataBound\"]"));
		ele.click();
		Thread.sleep(1000);
		Select sel = new Select(ele);
		sel.deselectAll();
//we are using xpath so index start from 1		
		sel.selectByIndex(3);
//isMultiple methods tels dropDown is multiselect or not		
		if (sel.isMultiple()) {
			sel.selectByIndex(1);
		}

//Print text of listBox	option	
		WebElement s1 = driver.findElement(By.id("PlaceHolderForContents_dropStatic"));
		Select selr = new Select(s1);
//store addrs of list box option		
		List<WebElement> ListSel = selr.getOptions();
		for (WebElement si : ListSel) {
			System.out.println(si.getText());
		}

	}

}
