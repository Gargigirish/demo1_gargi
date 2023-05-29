package extentlog4j;

import org.testng.annotations.Test;

public class Convertfromstring
{
   @Test
	public  void test1 () 
	{
	 String a= "10";
	 int b= Integer .Int(a);
	 System.out.println(b);
	}
   @Test
	public  void test2 () 
	{
	 String a= "10";
	 int b= Double .Double(a);
	 System.out.println(b);
	}
   @Test
	public  void test3 () 
	{
	 String a= "10";
	 int b= Float .Float(a);
	 System.out.println(b);
	}

}
