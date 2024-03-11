package ganeshnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		WebElement ganesh = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ganesh).perform();
		
		driver.findElement(By.xpath("//span[text()='Find a List or Registry']")).click();
		

	}

}
