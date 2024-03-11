package diwali;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("(//a[@target=\'_blank\'])[5]")).click();
		
		Set<String> chakli = driver.getWindowHandles();
		System.out.println(chakli);
		
	//	List<String> laddu=new ArrayList<String>(chakli);
		//String karanji = laddu.get(1);
		//System.out.println(karanji);
		//driver.switchTo().window(karanji);
		
		Iterator<String> itr = chakli.iterator();
		String parentid = itr.next();
		 String childid = itr.next();
		 System.out.println("P_id="+parentid);
		 System.out.println("C_id="+childid);
		
		
		driver.findElement(By.xpath("(//button[@type=\'submit\'])[1]")).click();
		
		
		
		

	}

}
