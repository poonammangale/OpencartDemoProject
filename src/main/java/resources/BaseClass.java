package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prob;
	
	public void initilializeDriver() throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\.metadata\\OpenCartDemoProject\\src\\main\\java\\resources\\data.properties");
		
		 prob=new Properties();
		prob.load(fis);
		
	String	browserName= prob.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")) {
		   driver= new ChromeDriver();
		   
		  }
		  else if(browserName.equalsIgnoreCase("Firefox")) {
		    driver= new FirefoxDriver();
		   
		  }
		  else if(browserName.equalsIgnoreCase("Edge")) {
		    driver= new EdgeDriver();
		   
		  }
		  else {
		   System.out.println("please choose valid browser to run your scripts");
		  }
	
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		
		initilializeDriver();
		String	urlName= prob.getProperty("url");
		driver.get(urlName);
	}
	
	@AfterTest
	
	public void closeBrowser() {
		driver.quit();
	}

}
