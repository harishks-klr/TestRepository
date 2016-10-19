/*
 * # Copyright (c) 2015, Hewlett-Packard Enterprise
 * # 
 * # THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * # "AS IS" AND IS INTENDED FOR INTERNAL USE ONLY.
 * #
 * # Author: Manuel Santamaria (PR SW QA) 
 * #    Email: m.santamaria@hpe.com
 * #
 * # Owner: Brenda Chaparro (PR SW QA MANAGER)
 * #   Email: brenda.chaparro@hpe.com
 */

package com.hpe.WebDriver.Nextgen.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hpe.WebDriver.WebDriverExtention.SelCustomFramework;

public class PortalsLoginPage {
    
    public WebDriver driver = null;
    
    // Factory Portal Login Page Initialization
    private By userIdById = By.id("nameField");
    private By passwordById = By.id("passwordField");
    private By submitButtonByCss = By.className("btn-login");
    private By errorMsgByXpath = By.xpath(".//*[@id='frm']/div[5]");
    
    
    public PortalsLoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    public void typeUsername(String usr)
    {
        driver.findElement(userIdById).sendKeys(usr);
    }
    
    public void typePassword(String psw)
    {
        driver.findElement(passwordById).sendKeys(psw);
    }
    
    public void clickLoginButton()
    {
        driver.findElement(submitButtonByCss).click();
    }
    
    public String getPageTitle()
    {
        return driver.getTitle();
    }
    
    public String getErrorMsgByXpath()
    {
        return driver.findElement(errorMsgByXpath).getText();
    }
    
    public boolean isErrorMsgPresentByXpath()
    {
        return SelCustomFramework.isElementPresent(driver, errorMsgByXpath);
    }
    
}
