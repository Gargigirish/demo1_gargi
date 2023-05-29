package Multipledataexcel;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceldataset
{
    public static void main(String[] args) throws
    {
    	FileInputStream fis=new FileInputStream("./Excel/Testdata.xlsx");
    	Workbook book=WorkbookFactory.create(fis);	
    	Sheet sh=book.getSheet("sheet1");
    	System.setProperty("webdriver.chrome.driver","./softwraes/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.amazon.com");
    	
    			
    }






}


