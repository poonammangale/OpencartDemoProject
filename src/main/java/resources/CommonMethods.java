package resources;

import org.testng.asserts.SoftAssert;

public class CommonMethods {

	
	public static void HandleAssertions(String expected, String Actual, String errorMessage){
		
		 SoftAssert assertion=new SoftAssert();
		  assertion.assertEquals(expected, Actual, errorMessage);
		        assertion.assertAll();
		
	}
}
