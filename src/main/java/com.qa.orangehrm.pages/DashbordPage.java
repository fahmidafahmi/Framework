package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {
    private WebDriver driver;


    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']//p")
    public WebElement successloginMsg;

    @FindBy(xpath = "//p[text()='My Actions']")
    public WebElement myActionTag;

  @FindBy(xpath="//span[text()='Admin']")
  public WebElement adminButton;
    public DashbordPage(WebDriver driver)
    {PageFactory.initElements(driver, this);
    }

}
