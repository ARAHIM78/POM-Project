package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GMailLogin {
	
		WebDriver driver;
		
		By GmailId		= By.name("Email");
		By nextBtn		= By.name("signIn");
		By passwd		= By.name("Passwd");
		By singinBtn	= By.xpath("//input[@value='Sign in']");
		
			
		//java constructor
		public GMailLogin(WebDriver driver)
		{
		this.driver= driver;
		
		}
		
		//Set email id in textbox
		public void setEmailID(String stremailid)
		{
			driver.findElement(GmailId).sendKeys(stremailid);
		}
		
		//click next button
		public void clickNextbtn()
		{
			driver.findElement(nextBtn).click();
		}
		
		//set password in password texbox
		public void setPassword(String strPasswd)
		{
			driver.findElement(passwd).sendKeys(strPasswd);
		}
		
		//Click SignIn button
		public void ClickSingInbtn()
		{
			driver.findElement(singinBtn).click();
		}
				
	}
