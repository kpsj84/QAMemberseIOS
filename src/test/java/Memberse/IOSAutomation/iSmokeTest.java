package Memberse.IOSAutomation;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import IOSPageObjects.LoginOptionPage;
import IOSPageObjects.RegisterPage;
import IOSPageObjects.WelcomePage;

public class iSmokeTest extends IBase {
    
  //Represents as one Test Case
	@Test
	public void iTutorialSwipeTestCase() throws InterruptedException {
			//Wait up to for next element to available and will execute immediately once element appear
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			try
			{
				driver.findElementByXPath("//button[@text='Open']").click();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			finally
			{
				System.out.println("Wait for application to load, It may take few seconds to perform first action");	
				Thread.sleep(10000);
			}
			
			//Thread.sleep(99990000);
			
			//Verify UI of Welcome Screen
			WelcomePage wp = new WelcomePage(driver);
			String TextWelcome = driver.findElementByXPath("//*[@name='Welcome to Memberse']").getText();
			System.out.println(TextWelcome);
			Assert.assertEquals(TextWelcome, "Welcome to Memberse");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wp.LoginButton().click();
			//App Notification Confirmation Button
			driver.findElementByAccessibilityId("Don’t Allow").click();
			LoginOptionPage lop = new LoginOptionPage(driver);
			lop.Email().sendKeys("ABC");
			driver.navigate().back();
			
			wp.SignupButton().click();
			RegisterPage rp = new RegisterPage(driver);
			rp.email().sendKeys("ABC");
			driver.navigate().back();
			
			System.out.println("Text is visible on screen and Click, Type Actions are working as Expected");
			System.out.println("This referes to Smoke Testing and its QA Pass");
		}

}
