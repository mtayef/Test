package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mukeshotwani/Desktop/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://stuntcoders.com/snippets/javascript-countdown/");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.titleContains("JavaScript countdown"));

		WebElement element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='01:01:01']")));

		String time = element.getAttribute("innerHTML");

		System.out.println("ELement is displayed? " + time);
		
		driver.quit();

	}

}