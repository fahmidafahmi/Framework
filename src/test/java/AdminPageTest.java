import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.AdminPage;
import com.qa.orangehrm.pages.DashbordPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

public class AdminPageTest extends TestBase {


    public WebDriver driver;
    public Actions ac;

    @BeforeTest
    public void setup() throws IOException {
        driver = driver_intl();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.dologin(prop.getProperty("userName"), prop.getProperty("passWord"));
        DashbordPage dp = new DashbordPage(driver);
        dp.adminButton.click();
        ac = new Actions(driver);

    }

    @Test
    public void test0() {
        AdminPage ad = new AdminPage(driver);
        ad.userName.sendKeys("branding123");
        ad.userRole.click();
        ac.keyDown(Keys.ARROW_DOWN).perform();
        ac.keyDown(Keys.TAB).perform();
        ad.employeeName.sendKeys("Fahmida");
        ad.status.click();
        ac.keyDown(Keys.ARROW_DOWN).perform();
        ac.keyDown(Keys.TAB).perform();


    }

    @AfterTest
    public void teardown() throws InterruptedException {

        Thread.sleep(5);
        driver.quit();


    }











}




























