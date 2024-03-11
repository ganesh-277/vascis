package ganeshnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc1234");
		
	//	driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("abc124");
		

	}

}
