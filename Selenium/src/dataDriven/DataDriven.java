package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	public static void main(String[] args) throws  InvalidFormatException, IOException {
//		System.setProperty("webdriver.chrome.driver", "./drv/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		FileInputStream fi = new FileInputStream("D:\\SELENIUM\\selenium SCRipt\\Worksheet.xlsx");
		Workbook wb= WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);	
		org.apache.poi.ss.usermodel.Cell c = r.getCell(0);
		String data =c.toString();
		System.out.println(data);
//get last row data		
		int row =sh.getLastRowNum();
		System.out.println(row);
		

		
	}

}
