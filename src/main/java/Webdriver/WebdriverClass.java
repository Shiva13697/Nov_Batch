package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://magnus.jalatechnologies.com/");
		 * driver.manage().window().maximize(); Thread.sleep(2000); String titlename =
		 * driver.getTitle(); System.out.println("The title name is: " + titlename);
		 * 
		 * String geturl = driver.getCurrentUrl(); System.out.println("The Url is: " +
		 * geturl);
		 */
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		// driver.close();

	}

}
