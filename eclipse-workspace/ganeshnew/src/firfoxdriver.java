
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfoxdriver {

	public static void main(String[] args, Object WebDriverManager) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\firefox\\geckodriver.exe");
	
	
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com");
	}

}
