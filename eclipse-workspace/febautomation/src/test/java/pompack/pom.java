package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
WebDriver ldriver;
@FindBy(xpath="//input[@name=\"email\"]") WebElement uname;
@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement pass;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement btn;

public pom(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
public void setusername(String username) 
{
	uname.sendKeys(username);
	
}
public void setpassword(String password) 
{
	pass.sendKeys(password);
	
}
public void logbtn() 
{
	btn.click();;
	
}




}
