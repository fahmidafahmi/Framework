package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

private WebDriver driver;

  @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement userName;

 @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    public WebElement userRole;
 @FindBy(xpath="//input[@placeholder='Type for hints...']")
  public WebElement employeeName;

 @FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
 public WebElement status;
 @FindBy(xpath="//button[text()=' Search ']")
 public WebElement searchButton;



  public AdminPage (WebDriver driver){
      PageFactory.initElements(driver,this);
  }





}















