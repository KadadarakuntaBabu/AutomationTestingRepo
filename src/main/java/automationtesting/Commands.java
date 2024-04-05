package automationtesting;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

// just edit pull for pull request
public class Commands {	
@Test
	public void Testcase1() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/"); 
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Sendkeys in search box fields
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Babu");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        WebElement text = driver.findElement(By.xpath("//div[@class='status-msg-body']"));
        System.out.println( text.getText());
        driver.findElement(By.xpath("(//a[normalize-space()='Show all posts'])[1]")).click();
        // print list of webelements
        List<WebElement> list = driver.findElements(By.xpath("//select[@id='multiselect1']"));
        WebElement q ;
        for(int i=0;i<list.size();i++) {
        	q = list.get(i);
        	System.out.println(q.getText());
        }
        //  Double click options perform
        WebElement dbclick = driver.findElement(By.xpath(" //button[@ondblclick='dblclickAlert()']"));
        Actions action = new Actions(driver);
        action.doubleClick(dbclick).perform();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(1000);
		alert1.accept();
		// Scroll up to the page
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1600)");
		Thread.sleep(2000);		
		// perform mouse actions 
		Actions action1 = new Actions(driver);
		WebElement blogsmenu = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		action1.moveToElement(blogsmenu).perform();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.quit();
        
	}	
}
