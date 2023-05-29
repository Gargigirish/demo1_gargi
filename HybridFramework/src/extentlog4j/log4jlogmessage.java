package extentlog4j;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class log4jlogmessage 
{
 @Test
 public void test1()
 {
	 BasicConfigurator.configure();
	 Logger log=Logger.getLogger(this.getLogs().getClass());
	 log.warn("WARN");
	 log.info("INFO");
	 log.error("ERROR");
	 
}
}
 