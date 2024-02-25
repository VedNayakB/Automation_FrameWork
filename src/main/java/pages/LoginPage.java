package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//Master_test1 //Develop_test2 //add Code to develop

	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	public void Login(String Username,String passwordtext)
	{
		userName.sendKeys(Username);
		password.sendKeys(passwordtext);
	}
	
	
	
	
	
	
}
