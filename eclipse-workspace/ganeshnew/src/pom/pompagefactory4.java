package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompagefactory4 {
@FindBy(xpath="//span[text()='akshay d.']")	WebElement usrnm;


public pompagefactory4(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public void uname(String extid)
{
	String actid = usrnm.getText();
boolean result = actid.equals(extid);
System.out.println("Result="+result);

if(result=true)
{
	System.out.println("TC pass:valid username");
	
}
else
{
	System.out.println("TC fail:invalid user");
}
}

}
