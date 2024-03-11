package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	System.out.println(alllinks.size());
	
	for(WebElement links:alllinks)
	{
		System.out.println(links.getText());
	}
	

	}

}
