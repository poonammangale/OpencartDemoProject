package testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.BaseClass;
import resources.CommonMethods;

public class VerifyURLLaunching extends BaseClass{
	
	@Test
	public void openBrowser() throws IOException {
		
		
		String actualText=driver.getCurrentUrl();
        String expctedText="https://demo.opencart.com/";
        CommonMethods.HandleAssertions(expctedText, actualText, "URL is not valid");
	}
	

}
