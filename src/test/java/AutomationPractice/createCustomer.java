package AutomationPractice;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CreateCustomerDetails;
import pageObjects.HomePage;
import resources.Base;
import resources.DataDriven;

public class createCustomer extends Base {
	
	public WebDriver driver;
	CreateCustomerDetails cust;
	DataDriven data;
	HomePage page;
	public  ArrayList<String> arr;
	public  Logger log=LogManager.getLogger(createCustomer.class.getName());
	
	@BeforeTest
	public void UrlNavigation() throws IOException {
		driver=intialize();
		driver.get(pr.getProperty("url"));
		
		
		
		
	}
	
//	@Test
//	public void customerSignIn() throws IOException {
//		
//	    page=new HomePage(driver);
//	   
//		
//		page.SignInLink().click();
//		log.info("SigIn successfully");
//	}
	
	@Test
	public void customerDetailsImplementaion() throws IOException {
		 page=new HomePage(driver);
		 page.SignInLink().click();
		 log.info("SigIn successfully");
	 cust=new CreateCustomerDetails(driver);
	 data=new DataDriven();
	 arr = data.extractData();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	    cust.EmailAddress().sendKeys(arr.get(0));
	    log.info("Email address entered");
	 
	    cust.CreateAccountButton().click();
	    log.info("Create Account button clicked");

		cust.Male().click();
		log.info("Male radio button clicked");
		
		cust.FirstName().sendKeys(arr.get(1));
		log.info("First Name Entered");
		
		cust.LastName().sendKeys(arr.get(2));
		log.info("Last Name Entered");
		
		cust.Password().sendKeys(arr.get(3));
		log.info("Password Entered");
		
		Select s1=new Select(cust.Days());
		s1.selectByValue(arr.get(4));
		log.info("Day Selected");
		
		Select s2=new Select(cust.Months());
		s2.selectByIndex(2);
		log.info("Month Selected");
		
		Select s3=new Select(cust.Years());
		s3.selectByValue(arr.get(6));
		log.info("Year Selected");
		
		cust.NewLetterCheckbox().click();
		log.info("News Letter checkbox checked");
		
		cust.SpecialOfferCheckbox().click();
		log.info("Special Offer Checkbox checked");
		
		cust.AddressFirstName().sendKeys(arr.get(7));
		log.info("Address First Name Entered");
		
		cust.AddressLastName().sendKeys(arr.get(8));
		log.info("Address Last Name Entered");
		
		cust.CompanyName().sendKeys(arr.get(9));
		log.info("Company Name Entered");
		
		cust.AddressName().sendKeys(arr.get(10));
		log.info("Address Name Entered");
		
		cust.CityName().sendKeys(arr.get(11));
		log.info("City Name Entered");
		
		Select s4=new Select(cust.StateName());
		s4.selectByValue(arr.get(12));
		log.info("State Name Entered");
		
		cust.PostalCode().sendKeys(arr.get(13));
		log.info("Postal code entered");
		
		Select s5=new Select(cust.CountryName());
		s5.selectByValue(arr.get(14));
		log.info("Countery Name Entered");
		
		cust.PhoneNumber().sendKeys(arr.get(15));
		log.info("Phone Number Entered");
		
		cust.AliasAddress().sendKeys(arr.get(16));
		log.info("Allias Address Entered");
		
		cust.RegisterButton().click();
		log.info("Register button clicked");
		
		
	}
	
//	@AfterTest
//	public void closeAllBrowser() {
//		driver.close();
//	}

}
