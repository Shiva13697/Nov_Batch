package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.linkText("Create")).click(); Thread.sleep(2000);
		 * WebElement Country = driver.findElement(By.id("CountryId")); Select select =
		 * new Select(Country); Thread.sleep(2000); select.selectByVisibleText("Japan");
		 * Thread.sleep(2000); select.selectByIndex(1);
		 */
		driver.findElement(By.linkText("Search")).click();
	}

}
