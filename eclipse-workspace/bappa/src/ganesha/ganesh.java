package ganesha;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ganesh {
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
		
		System.setProperty("webdriver.chromee.driver","C:\\Users\\admin\\Desktop\\New folder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		
	}
	@Test
	public void title()
	{
		String mm = driver.getTitle();
		
		System.out.println(mm);
	}
	@AfterMethod
	
	public void end() {
		driver.quit();
	}

}
