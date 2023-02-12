package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
private WebDriver driver;
 //page factory model
 // a[@name= "username"]
 //driver.findelement.by.xpa


 @FindBy(xpath = "//input[@name='username']")
 public WebElement userName;
 @FindBy(xpath = "//input[contains(@name,'password')]")
 public WebElement passWord;
 @FindBy(xpath = "//button[contains(@class,'oxd-button oxd')]")
 public WebElement loginButton;
 @FindBy(xpath = "//p[text()='Forgot your password? ']")
 public WebElement forgotPassWordlinks;

 public LoginPage(WebDriver driver){
  PageFactory.initElements(driver, this);
 }
public DashbordPage dologin(String uname, String pwd){
  userName.sendKeys(uname);
  passWord.sendKeys(pwd);
  loginButton.click();
  return new DashbordPage(driver);
}


}

