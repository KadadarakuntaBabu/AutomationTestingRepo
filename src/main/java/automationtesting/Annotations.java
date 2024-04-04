package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver = new ChromeDriver();
	    
@BeforeMethod
public void Login() {
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();

}
@Test(priority=1)
public void Testcase1()  {
	driver.findElement(By.xpath("//a[normalize-space()='Page One']")).click();
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[@id='blogsmenu']")));
	List<WebElement>  blogslist = driver.findElements(By.xpath("//span[@id='blogsmenu']"));
     System.out.println(blogslist);



}
@AfterMethod
public void Logout() {
	driver.close();
 
} 

}
