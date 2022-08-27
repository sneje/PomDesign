package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void verifyLogin() {
		loginPage.login();
		//AssertJUnit.assertEquals(pimPage.titleOfPimPage(),"PIM");
	}

}
