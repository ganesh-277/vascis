package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomwithpagefactory {
	@FindBy(xpath="//input[@name=\'userId\']") private WebElement userid;
	@FindBy(xpath="//input[@type=\"password\"]")  private WebElement password;
	@FindBy(xpath="//button[@id=\"submit-btn\"]") private WebElement singup;




public pomwithpagefactory(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void id(String fname)
{
	userid.sendKeys(fname);
}
public void pass(String pswd)
{
	password.sendKeys(pswd);
}
public void clk()
{
	singup.click();
}
	}
