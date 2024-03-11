package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("file:///C:/Users/admin/Desktop/narak.html");
		
	int kareena = driver.findElements(By.xpath("//table[@id=\"1234\"]//tr")).size();
	 System.out.println("no of rows="+kareena);
	 int karishma = driver.findElements(By.xpath("//table[@id=\"1234\"]//th")).size();
	 System.out.println("no of coloumns="+karishma);
		

	}

}
