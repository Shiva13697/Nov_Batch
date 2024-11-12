package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'UserName\']")).sendKeys("training@jalaacademy.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(2000);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dec = new File("D:\\CoreJava_Jala Acadamy\\SELENIUMBASIC_MVN\\Screenshots\\Image2.png");
		FileHandler.copy(scr, Dec);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout"));
		Thread.sleep(2000);
		driver.close();

	}

}
