package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mukeshotwani/Desktop/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

		boolean status = element.isDisplayed();

		System.out.println("ELement is displayed? " + status);

	}

}