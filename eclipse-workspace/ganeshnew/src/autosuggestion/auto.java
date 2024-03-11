package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class auto {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("mobile");
		Thread.sleep(2000);
		List<WebElement> gg = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		int asize = gg.size();
		System.out.println(asize);
		Thread.sleep(7000);
		
		gg.get(asize-1).click();
		
		

	}

}
