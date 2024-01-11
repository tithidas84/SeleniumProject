package testngPackage;

import org.testng.annotations.Test;

public class TimeOutClass {
@Test(timeOut=1000)
	void test1()
	{
		System.out.println("first test");
		
	}
	@Test(timeOut =1000)
	void test2() throws InterruptedException
	{
		System.out.println("This is test 2");
		Thread.sleep(4000);
	}
}
