package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamichandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe\\");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("vapurza");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		
		 String ratings = driver.findElement(By.xpath("(//div[@class=\"_1YokD2 _2GoDe3\"][1]//span)[7]")).getText();
		 
		 System.out.println(ratings);
		
				

	}

}
