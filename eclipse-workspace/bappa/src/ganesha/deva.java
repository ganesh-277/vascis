package ganesha;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class deva {
	
	WebDriver driver;
	@BeforeMethod
public void shree(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://www.facebook.com");
		
}
@Test
public void verifytitle()
{
	String gg = driver.getTitle();
	
	System.out.println(gg);
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
	
	

}
