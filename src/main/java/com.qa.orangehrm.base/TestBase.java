package com.qa.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.naming.Name;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public Properties prop;
    public  FileInputStream fis;



    public WebDriver driver_intl() throws IOException {

        prop = new Properties();
        fis = new FileInputStream("C:\\Users\\fahmi\\IdeaProjects\\Framework22\\src\\main\\java\\com.qa.orangehrm.config\\config.properties");

        prop.load(fis);


        String browser_Name = prop.getProperty("browserName");



        if (browser_Name.equalsIgnoreCase("chorme")) {
              driver = new ChromeDriver();
          } else if (browser_Name.equalsIgnoreCase("EdgDriver"))
          {
              driver = new EdgeDriver();
          } else if (browser_Name.equalsIgnoreCase("FirefoxDriver")) {
              driver = new FirefoxDriver();
          } else if (browser_Name.equalsIgnoreCase("SafariDriver")) {
              driver = new SafariDriver();
          }
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          driver.get( prop.getProperty("url"));
          return driver;
    }


    public static void main(String[] args) throws IOException {

         TestBase r= new TestBase();
         r.driver_intl();

          }

     }



