package extentlog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jprintmessageonreport 
{
  @Test
  public void test1()
  {
	  Layout lay=new PatternLayout("%d,%c,%m,%n");
	  Appender app= new FileAppender(lay,"./rep/");
	  BasicConfigurator.configure(app);
	  
	  Logger log=Logger.getlogger(this.getClass().getName());
	 
	  
	  log.warn("WARN");
	  log.info("INFO");
	  log.error("ERROR");
	 
  }
}
