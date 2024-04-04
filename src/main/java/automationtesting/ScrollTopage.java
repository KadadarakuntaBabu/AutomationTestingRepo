package automationtesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollTopage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
				
		File srcscreenshot = driver.findElement(By.name("q")).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcscreenshot,new File(System.getProperty("user.dir")+"\\screenshot.png"));
	    driver.quit();
	
		
	}
	
}
