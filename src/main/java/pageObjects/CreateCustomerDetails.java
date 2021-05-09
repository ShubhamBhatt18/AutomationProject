package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerDetails {

	WebDriver driver;
	 public  Logger log=LogManager.getLogger(CreateCustomerDetails.class.getName());
	
	public CreateCustomerDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//input[@id='email_create']")
      WebElement emailAddress;
	 
	 
	 public WebElement EmailAddress() {
		 log.info("email address POM");
		 return emailAddress;
		 
	 }
	 
	 @FindBy(css="div[class='submit'] button")
	 WebElement createAcccount;
	 public WebElement CreateAccountButton() {
		 log.info(" create account POM");
		 return createAcccount;
		 
	 }
	 
	 @FindBy(xpath="//input[@id='id_gender1']")
	 WebElement MaleRadio;
	 
	 @FindBy(css="input[id='id_gender2']")
	 WebElement FemaleRadio;
	 
	 public WebElement Male()
	 {
		 log.info("male radio POM");
		 return MaleRadio;
	 }
	 
	 public WebElement Female()
	 {
		 log.info("femal radio POM");
		 return FemaleRadio;
	 }
	 
	 
	 @FindBy(css="input[id='customer_firstname']")
	 WebElement firstName;
	 
	 public WebElement FirstName()
	 {
		 log.info("First Name POM");
		 return firstName;
	 }	 
	 
	 
	 @FindBy(css="input[id='customer_lastname']")
	 WebElement lastName;
	 
	 public WebElement LastName() {
		 log.info("LastName POM");
		 return lastName;
	 }
	 
	 @FindBy(css="input[id='passwd']")
	 private WebElement password;
	 
	 public WebElement Password() {
		 log.info("password POM");
		 return password;
	 }
	 
	 @FindBy(css="select[id='days']")
	 private WebElement days;
	 
	 public WebElement Days() {
		 log.info("Days POM");
		 return days;
		}
	 
	 
	 
	 @FindBy(css="select[id='months']")
	 private WebElement months;
	 
	 public WebElement Months() {
		 log.info("Month POM");
		 return months;
	 }
	 
	 
	 @FindBy(css="select[id='years']")
	 private WebElement years;
	 
	 public WebElement Years() {
		 log.info("Years POM");
		 return years;
	 }
	 
	 
	 @FindBy(css="input[id='newsletter']")
	 private WebElement newsletterCheckbox;
	 
	 public WebElement NewLetterCheckbox() {
		 log.info("NewLetterCheckbox POM");
		 return newsletterCheckbox;
	 }
	 
	 
	 @FindBy(css="input[id='optin']")
	 private WebElement specialOfferCheckbox;
	 
	 public WebElement SpecialOfferCheckbox() {
		 log.info("SpecialOfferCheckbox POM");
		 return specialOfferCheckbox;
	 }
	 
	 
	 @FindBy(css="input[id='firstname']")
	 private WebElement addFirstName;
	 
	 public WebElement AddressFirstName() {
		 log.info("AddressFirstName POM");
		 return addFirstName;
	 }
	 
	 
	 @FindBy(css="input[id='lastname']")
	 private WebElement addLastName;
	 
	 public WebElement AddressLastName() {
		 log.info("AddressLastName POM");
		 return addLastName;
	 }
	 
	 
	 @FindBy(css="input[id='company']")
	 private WebElement companyName;
	 
	 public WebElement CompanyName() {
		 log.info("CompanyName log");
		 return companyName;
	 }
	 
	 
	 @FindBy(css="input[id='address1']")
	 private WebElement address;
	 
	 public WebElement AddressName() {
		 log.info("AddressName log");
		 return address;
	 }
	 
	 
	 @FindBy(css="input[id='city']")
	 private WebElement cityName;
	 
	 public WebElement CityName() {
		 return cityName;
	 }
	 
	 @FindBy(css="select[id='id_state']")
	 private WebElement stateName;
	 
	 public WebElement StateName() {
		 return stateName;
	 }
	 
	 
	 @FindBy(css="input[id='postcode']")
	 private WebElement postalCode;
	 
	 public WebElement PostalCode() {
		 log.info("PostalCode POM");
		 return postalCode;
	 }
	 
	 
	 
	 @FindBy(css="select[id='id_country']")
	 WebElement countryName;
	 
	 public WebElement CountryName() {
		 log.info("CountryName POM");
		 return countryName;
	 }
	 
	 
	 @FindBy(css="input[@id='phone_mobile']")
	 private WebElement phoneNumber;
	 
	 public WebElement PhoneNumber() {
		 log.info("PhoneNumber POM");
		 return phoneNumber;
	 }
	 
	 @FindBy(css="input[id='alias']")
	 private WebElement aliasAddress;
	 	
	 public WebElement AliasAddress() {
		 log.info("AliasAddress POM");
	 		return aliasAddress;
	 	}
	 
	 
	 @FindBy(css="button[id='submitAccount']")
	 private WebElement Register;
	 
	 public WebElement RegisterButton() {
		 log.info("RegisterButton POM");
		 return Register;
	 }
	 
	 
	 
}
