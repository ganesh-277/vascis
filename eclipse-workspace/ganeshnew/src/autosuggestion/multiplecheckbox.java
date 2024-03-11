package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplecheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe\\");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
	List<WebElement> gg = driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,'day')]"));
System.out.println(gg.size());

for(WebElement gan:gg)
{
	String ww = gan.getAttribute("id");
	if(ww.equals("monday")|| ww.equals("sunday") ||ww.equals("friday"))
	{
	gan.click();
	}
	
	}

}
}