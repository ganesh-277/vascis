package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomwithpagefactory2 {
	
	@FindBy(xpath="//input[@type=\"text\"]") WebElement passcode;



public pomwithpagefactory2 (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void pcode(String code)
{
	passcode.sendKeys(code);
}
}
