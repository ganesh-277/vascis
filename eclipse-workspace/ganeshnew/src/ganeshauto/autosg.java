package ganeshauto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
         
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("http://www.google.com");
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
			List<WebElement> gan = driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]//li"));
				
				int gg = gan.size();
				System.out.println(gg);
				
				for(WebElement list:gan)
				{
					String hh = list.getText();
					if(hh.contains("interview"))
					{
						list.click();
						break;
					}
					
						
				
				}
		
	}

}
