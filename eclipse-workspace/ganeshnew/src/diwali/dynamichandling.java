package diwali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamichandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class=\'L0Z3Pu\']")).click();
		driver.findElement(By.xpath("//input[@class=\'_3704LK\']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@class=\'L0Z3Pu\']")).click();
		driver.findElement(By.xpath("//div[@class=\'_4rR01T\'][1]")).click();
		//String reviews = driver.findElement(By.xpath("(//a[@class=\'_1fQZEK\']//span)[8]")).getText();
		//System.out.println(reviews);

	}

}
