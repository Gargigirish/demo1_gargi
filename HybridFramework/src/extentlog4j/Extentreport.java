package extentlog4j;

import org.testng.annotations.Test;

public class Extentreport<ExtentREports>
{
 @Test
 public void test()
 {
	 Extentreports rep=new Extentreports("./rep/");
	 Extenttest test=rep.StartTest("tc1");
	 test.log(logstatus.PASS,"PASS");
	 test.log(logstatus.FAIL,"FAIL");
	 test.log(logstatus.SKIP,"SKIP");
	 rep.endtest(test);
	 rep.flush();
 }	 
	 
} 
	 
	 
	 