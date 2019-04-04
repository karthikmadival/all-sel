package findelmnt;

import java.util.LinkedHashMap;
import java.util.Set;


public class MapsEx {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./2.45/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/chethan/Desktop/ListBox.html");
//		WebElement sel = driver.findElement(By.xpath("//select[@id='Multi']"));
//		Select s=new Select(sel);
		LinkedHashMap<String, Integer> hsm = new LinkedHashMap<String, Integer>();
		hsm.put("paneer", 1);
		hsm.put("kabab", 2);
		hsm.put("gobi", 2);
		hsm.put("chicken", 1);
		hsm.put("kabab", 3);
		Integer s = hsm.get("kabab");
		System.out.println(s);
		System.out.println(hsm);
		System.out.println(hsm.containsKey("kabab"));
		Set<String> fd = hsm.keySet();
		for (String ser : fd) {
			System.out.println(ser);
		}
		
		
	}

}
