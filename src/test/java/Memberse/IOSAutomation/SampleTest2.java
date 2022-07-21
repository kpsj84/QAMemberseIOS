package Memberse.IOSAutomation;

import org.testng.annotations.Test;

import IOSPageObjects.SamplePage;

public class SampleTest2 extends IBase {
    
  @Test
  public void shouldAnswerWithTrue2() {
	  SamplePage sp = new SamplePage(driver);	
	  sp.AlertViewsButton().click();
	 
	  // driver.findElementByAccessibilityId("Alert Views").click();
	  driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text Entry']").click();
	  driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
	  driver.findElementByAccessibilityId("OK").click();
	  driver.findElementByAccessibilityId("Confirm / Cancel").click();
	  
	  System.out.println(driver.findElementByXPath("//*[contains(@name, 'message')]").getText());
	  driver.findElementByAccessibilityId("Confirm").click();  
  }
  
}
