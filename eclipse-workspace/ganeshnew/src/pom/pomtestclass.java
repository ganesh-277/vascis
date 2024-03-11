package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomtestclass {
	
	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(3000);
		
		pomwithpagefactory page1=new pomwithpagefactory(driver);
		pomwithpagefactory2 page2=new pomwithpagefactory2 (driver);
		pompagefactory3 page3=new pompagefactory3(driver);
		 pompagefactory4 page4=new  pompagefactory4(driver);
		page1.id("4JBMM6");
		page1.pass("Strength@123");
		page1.clk();
		
		Thread.sleep(3000);
		
		page2.pcode("1993");
		
		Thread.sleep(9000);
		
		page3.igood();
		
		Thread.sleep(2000);
	
		page4.uname("akshay.D");

}
}