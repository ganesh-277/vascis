import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autopractice {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.bing.com/");
		
		driver.findElement(By.xpath("//input[@class='sb_form_q']")).sendKeys("selenium");
		
		List<WebElement> mob =driver.findElements(By.xpath("//li[class='sa_sg']//span"));
		
		int dsize = mob.size();
		System.out.println(dsize);

	}

}
