package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
   
	public WebDriver driver;
	public Properties pr;
	public FileInputStream fis;

	
	public WebDriver intialize() throws IOException {
		
		pr=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
		pr.load(fis);
		
		String browserName=pr.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
		    driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");
			driver=new FirefoxDriver();
		}
		
		return driver;
         
	}
	
	public void getScreenshot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"/Screeshot/screenshotof"+result+".png"));
		
	}
}
