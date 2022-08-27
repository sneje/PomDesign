package test;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	@Test(priority=2)
	public void verifyText() {
		loginPage.login();
		String a=pimPage.titleOfPimPage();
		System.out.println(a);
		Assert.assertEquals(a, "PIM");
	}
       @Test (priority=4)
       public void verifyCheckbox() throws InterruptedException {
    	   pimPage.checkbox();
       }
      
       
}
