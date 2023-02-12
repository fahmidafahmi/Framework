import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DashbordPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {
public WebDriver driver;


   @BeforeTest
    public void setup() throws IOException {
       driver = driver_intl();
   }


    @Test
   public void validLoginTest() {
       LoginPage loginPage = new LoginPage(driver);
       loginPage.userName.sendKeys("Admin");
       loginPage.passWord.sendKeys("admin123");
       loginPage.loginButton.click();
   }
   @Test
   public void validLoginOptimizeTest() {
       LoginPage loginPage = new LoginPage(driver);
       loginPage.userName.sendKeys(prop.getProperty("userName"));
       loginPage.passWord.sendKeys(prop.getProperty(("passWord")));
       loginPage.loginButton.click();
       DashbordPage dp =new DashbordPage(driver);
       //dp.successloginMsg.isDisplayed();
       Assert.assertTrue(dp.successloginMsg.isDisplayed());

   }

   @Test
   public void forgotPassWordlinksTest(){
    LoginPage loginPage =new LoginPage(driver);
    boolean b =loginPage.forgotPassWordlinks.isDisplayed();
    Assert.assertTrue(b);
}

   @Test
   public void pageTitleTest(){
    String actualpageTitle= driver.getTitle();
    String expectedpageTitle="OrangeHRM";
    Assert.assertEquals(actualpageTitle,expectedpageTitle);

}
//
   @AfterTest
    public void teardown(){
    try {
        Thread.sleep(5);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();


}





}
