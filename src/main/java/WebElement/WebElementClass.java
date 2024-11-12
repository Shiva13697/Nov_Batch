package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys("training@jalaacademy.com");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.name("Password"));
		Password.sendKeys("jobprogram");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.xpath("//button[@id=\"btnLogin\"]"));
		Login.click();
		Thread.sleep(2000);
		driver.close();

	}

}
