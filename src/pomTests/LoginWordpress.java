/**
 * 
 */
package pomTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.LoginPage;

/**
 * @author SR
 *
 */
public class LoginWordpress {
	{System.setProperty("webdriver.chrome.driver" , "c:\\webdrivers\\chromedriver.exe");}
	WebDriver driver=null;

	
	@Test
	public void verifyWordpressLogin(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		LoginPage login= new LoginPage(driver);
		login.typeusername("admin");
		login.typePassword("demo123");
		login.LoginButton();
		
	}

	
	

}
