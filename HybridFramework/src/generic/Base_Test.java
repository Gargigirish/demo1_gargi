package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class Base_Test implements Framework_constant;
public WebDriver driver;
@BeforeMethod
{
 public void openAppln()
 {
	 System.setProperty(chrome_key,chrome_value);
	 driver=new ChromeDriver();
	 driver.get(base_url);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
 }
@AfterMethod
public void closeAppln(ITestResult res) throws IOException
{
	if(ITestResult.FAILURE==res.getStatus())
	{
		Generic_Shot.getPhoto(driver);
	}
      driver.close();
  }
}

