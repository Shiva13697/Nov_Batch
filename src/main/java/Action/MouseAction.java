package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*
		 * driver.get(
		 * "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html")
		 * ; WebElement src = driver.findElement(By.id("box7")); WebElement des =
		 * driver.findElement(By.id("box106")); Actions action = new Actions(driver);
		 * Thread.sleep(3000); action.clickAndHold(src).perform(); Thread.sleep(3000);
		 * action.release(des).perform(); Thread.sleep(3000); driver.close();
		 */
		Thread.sleep(3000);
		driver.get("https://demoqa.com/buttons");
		WebElement dbleclk = driver.findElement(By.id("doubleClickBtn"));
		WebElement rtclk = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.doubleClick(dbleclk).perform();
		Thread.sleep(3000);
		action.contextClick(rtclk).perform();
	}

}
