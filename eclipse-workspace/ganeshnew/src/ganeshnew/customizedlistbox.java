package ganeshnew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedlistbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		//act.sendKeys(Keys.ARROW_UP).perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		//Thread.sleep(3000);
		//act.sendKeys(Keys.HOME).perform();
		
		//Thread.sleep(2000);
		//act.sendKeys(Keys.END).perform();
		
		//Thread.sleep(4000);
		
		//for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(3000);
		}
		act.sendKeys(Keys.ENTER).perform();

	}

}
