package autosuggestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Int {

	public static void main(String[] args) {
		
		System.setProperty("webdrive.chrome.driver","\\D:\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.google.com");

	}

}
