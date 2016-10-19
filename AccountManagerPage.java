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

import com.hpe.WebDriver.WebDriverExtention.SelCustomFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AccountManagerPage {
    
    WebDriver driver = null;
    
    public AccountManagerPage(WebDriver driver)
    {
        this.driver = driver;
        this.driver.switchTo().frame("UAM");
    }
    
    private By cpAccountManagerHeader = By.id("headerstyle");
    private By fpAccountManagerHeader = By.xpath("html/body/main/h3/strong/text()");
    private By searchBox = By.id("SearchBox");
    private By searchBoxByXpath = By.xpath(".//*[@id='SearchBox']");
    private By errorMsg = By.id("emptyStringResult");
    private By searchResultsFirstOption = By.xpath(".//*[@id='UserSelect']/option[1]");
    private By searchResults = By.id("UserSelect");
    private By searchResultsOptions = By.xpath("//*[@id='UserSelect']/option");
    private By groupList = By.id("select-to");
    private By groupListOptions = By.xpath("//*[@id='select-to']/option");
    private By groupRoleDropdown = By.xpath(".//*[@id='grouprole']");
    private By optionXpath = By.xpath("//*[@id='grouprole']/option");
    private By addButton = By.id("btn-add");
    private By removeButton = By.id("btn-remove");
    private By saveButton = By.id("save");
    private By confirmation = By.id("jsonsuccess");
    
    
    public String getCPAccountManagerHeaderText()
    {
        return driver.findElement(cpAccountManagerHeader).getText();
    }
    
    public String getFPAccountManagerHeaderText()
    {
        return driver.findElement(fpAccountManagerHeader).getText();
    }
    
    public void writeIntoSearchBox(String str)
    {
        driver.findElement(searchBox).sendKeys(str);
    }
    
    public void clearSearchBox()
    {
        driver.findElement(searchBoxByXpath).clear();
    }
    
    public String getErrorMsg()
    {
        return driver.findElement(errorMsg).getText();
    }
    
    public String getFirstResult()
    {
        return driver.findElement(searchResultsFirstOption).getText();
    }
    
    public boolean isInSearchResults(String value)
    {
       return SelCustomFramework.isAnOption(searchResults, value);
    }
    
    public boolean isInGroupList(String usrEmail)
    {
        return SelCustomFramework.optionsContains(groupList, usrEmail);
    }
    
    public void selectGroup(String group)
    {
        SelCustomFramework.selectFromDropDownByValue(optionXpath,groupRoleDropdown, group);
    }
    
    public void selectUserFromGroupList(String usrEmail)
    {
        //SelCustomFramework.selectFromDropDownByText(groupList, usrEmail);
        SelCustomFramework.selectFromDropDownByValue(groupListOptions, groupList, usrEmail);
    }
    
    public void selectUserFromUnassignedUserList(String usrEmail)
    {
        //SelCustomFramework.selectFromDropDownByText(searchResults, usrEmail);
        SelCustomFramework.selectFromDropDownByValue(searchResultsOptions,searchResults,usrEmail);
    }
    
    public void typeUserName(String usrEmail)
    {
        driver.findElement(searchBox).sendKeys(usrEmail);
    }
    
    public void clickRemoveButton()
    {
        driver.findElement(removeButton).click();
    }
    
    public void clickSaveButton()
    {
        driver.findElement(saveButton).click();
    }
    
    public void clickAddButton()
    {
        driver.findElement(addButton).click();
    }
    
    public void waitForConfirmation() throws Exception 
    {
        SelCustomFramework.waitForElementPresent(confirmation);
        Assert.assertTrue(SelCustomFramework.isElementPresent(confirmation));
    }
    
    public boolean isConfirmationPresent()
    {
        return SelCustomFramework.isElementPresent(confirmation);
    }
    
    public void waitForRemoveButton() throws Exception
    {
        SelCustomFramework.waitForElementVisible(removeButton);
        Assert.assertTrue(SelCustomFramework.isElementVisible(removeButton));
    }
    
    public void waitForAddButton() throws Exception
    {
        SelCustomFramework.waitForElementVisible(addButton);
        Assert.assertTrue(SelCustomFramework.isElementVisible(addButton));
    }
    

    
}
