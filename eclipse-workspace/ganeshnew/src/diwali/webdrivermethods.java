package diwali;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://viitindia.org/site/");
		//Thread.sleep(3000);
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String div = driver.getTitle();
		System.out.println(div);
		 Dimension d=new Dimension(500,200);
		 System.out.println(d);
		 Dimension apurva = driver.manage().window().getSize();
		 System.out.println(apurva);
		 Thread.sleep(3000);
		 Point p=new Point(200,100);
		 
		 driver.manage().window().setPosition(p);
		 
		 
		 
		

	}

}
