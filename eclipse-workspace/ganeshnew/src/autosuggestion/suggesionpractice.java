package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggesionpractice {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("mobile");
		
		List<WebElement> mob =driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		int dsize = mob.size();
		System.out.println(dsize);

	}

}
