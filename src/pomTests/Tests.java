package pomTests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.GMailLogin;
import pomPages.GlogOutPage;

public class Tests {
		{System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");}
			WebDriver driver= new ChromeDriver();

	
			@Test
			public void LoginToGmail() throws InterruptedException{
			//WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			
			GMailLogin login= new GMailLogin(driver);
			
			login.setEmailID("gazienam");
			login.clickNextbtn();
			Thread.sleep(1000);
			login.setPassword("Dhaka1996");
			login.ClickSingInbtn();
			Thread.sleep(7000);
			
			//Gmail Logout
			GlogOutPage logout=new GlogOutPage(driver);
			logout.signOutBtnClick();
			Thread.sleep(1000);
			logout.signOutButtonClick();
			Thread.sleep(5000);

			}
			
			@After
			public void CloseBrowser(){
				driver.close();		
			}
			
			
}
