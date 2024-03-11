package testpack;

import org.testng.annotations.Test;

import pompack.pom;

public class Testclass extends baseclass {
	@Test
	public void logintest()
	{
		driver.get("https://develop.vacisautomation.com");
		pom pm=new pom(driver);
		pm.setusername("admin@gmail.com");
		pm.setpassword("12345678");
		pm.logbtn();
	       
		
	}

}
