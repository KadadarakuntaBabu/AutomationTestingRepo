package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testngtest {
	WebDriver driver = new ChromeDriver();
@BeforeMethod
public  void Login() {
//	System.setProperty("webdriver.chrome.driver","C:\\Eclipse2023files\\Flipkartproject\\drivers\\chromedriver.exe");
    driver.get("https://omayo.blogspot.com/");
    driver.manage().window().maximize();
}	
@AfterMethod
 public void Logout() {
	driver.close();
	 
 }
}
