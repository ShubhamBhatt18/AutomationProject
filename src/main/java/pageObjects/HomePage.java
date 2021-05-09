package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;		
	 public HomePage(WebDriver driver) {
		 
		 this.driver =driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(css="a[class='login']")
	 public WebElement SignIn;
	 
	 public WebElement SignInLink() {
		 return SignIn;
	 }

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
