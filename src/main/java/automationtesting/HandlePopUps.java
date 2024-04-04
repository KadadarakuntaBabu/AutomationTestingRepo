package automationtesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlePopUps {
@Test
	public void Test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/"); 
	//	String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window"));
		Set<String> window = driver.getWindowHandles();

		for(String win : window) {
			driver.switchTo().window(win);
			if(driver.getTitle().equals("https://the-internet.herokuapp.com/windows/new")) {
				Thread.sleep(3000);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.close();
			}			
		}
		driver.quit();
	}
}
