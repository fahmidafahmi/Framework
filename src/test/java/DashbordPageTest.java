import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DashbordPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashbordPageTest extends TestBase {

    public WebDriver driver;

    @BeforeTest
    public void setup() throws IOException {
        driver = driver_intl();
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.userName.sendKeys(prop.getProperty("userName"));
        //loginPage.passWord.sendKeys(prop.getProperty(("passWord")));
        //loginPage.loginButton.click();
     loginPage.dologin(prop.getProperty("userName"), prop.getProperty("passWord") );
    }

    @Test
    public void test1() {
        DashbordPage dp = new DashbordPage(driver);
      String actualTag = dp.myActionTag.getText();
        Assert.assertEquals(actualTag, "My Action");

    }

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













