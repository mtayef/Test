package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest {
	
	static WebDriver driver; static int rowCount;
	static int count; static String value;
	static WebElement table; static int valueInteger;
	static String extras; static int Extras;
	static int sum=0; static int actualTotalValue;
	static String expectedTotal; static int expectedTotalValue;
	
	@Test
	public static void tableExample() {
		driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/"
				+ "19356/ban-vs-sl-2nd-test-sri-lanka-tour-of-bangladesh-2018");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		table = driver.findElement(By.cssSelector
				("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		rowCount=table.findElements(By.cssSelector
				("div[class = 'cb-col cb-col-100 cb-scrd-itms']")).size();
		count= table.findElements(By.cssSelector
				("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i = 0; i <count-2; i++) {
			
			value = table.findElements(By.cssSelector
					("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
					.get(i)
					.getText();
			valueInteger = Integer.parseInt(value);
			sum=sum+valueInteger;
		}
		extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		Extras = Integer.parseInt(extras);
		actualTotalValue = sum+Extras;
		
		expectedTotal = driver.findElement(By.xpath
				("//div[text()='Total']/following-sibling::div")).getText();
		expectedTotalValue = Integer.parseInt(expectedTotal);
		
		Assert.assertEquals(actualTotalValue, expectedTotalValue, "The numbers are matching");
		
		driver.quit();
	}
	
}