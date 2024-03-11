package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompagefactory3 {
	
	@FindBy(xpath="//div[text()='No, I’m good']") private WebElement good;

	public pompagefactory3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void igood()
	{
		good.click();
	}
}
