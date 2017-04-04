/**
 * 
 */
package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author SR
 *
 */
public class LoginPage {
	WebDriver driver;
	
	By username= By.id("user_login");
	By password= By.name("pwd");
	By loginbtn= By.name("wp-submitt");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeusername(String strusername)
	{
		driver.findElement(username).sendKeys("strusername");
	}

	public void typePassword(String strpassword)
	{
		driver.findElement(password).sendKeys("strpassword");
	}
	
	public void LoginButton()
	{
		driver.findElement(loginbtn).click();
	}
}
