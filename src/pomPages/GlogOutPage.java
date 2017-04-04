package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlogOutPage {
	
	WebDriver driver;
	
	By signOutBtn	= By.xpath("//span[@class='gb_9a gbii']");
	By signOutButton= By.id("gb_71");
	
	public GlogOutPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void signOutBtnClick(){
		
		driver.findElement(signOutBtn).click();
	}
	
	public void signOutButtonClick(){
		
		driver.findElement(signOutButton).click();
	}

}
