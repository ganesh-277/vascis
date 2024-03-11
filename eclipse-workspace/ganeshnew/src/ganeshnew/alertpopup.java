package ganeshnew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().dismiss();
		
		//Alert alt = driver.switchTo().alert();
		
	//	String msg = alt.getText();
	//	System.out.println(msg);
		

	}

}
