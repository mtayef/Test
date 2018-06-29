package test;

import org.testng.annotations.Test;

public class TestPractice
{
	
	@Test
	public void practiceTest() 
	{
		System.out.println("Test one");
	}
	@Test
	public void practiceTest1() 
	{
		System.out.println("Test two");
		System.out.println("Testing method name: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
