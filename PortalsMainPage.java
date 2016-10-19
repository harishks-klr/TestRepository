/*
 * # Copyright (c) 2015, Hewlett-Packard Enterprise
 * # 
 * # THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * # "AS IS" AND IS INTENDED FOR INTERNAL USE ONLY.
 * #
 * # Author: Manuel Santamaria (PR SW QA) 
 * #  Email: m.santamaria@hpe.com
 * # 
 * # Owner:  Brenda Chaparro
 * # Email:  brenda.chaparro@hpe.com        
 * #
 */

package com.hpe.WebDriver.Nextgen.Pages;

import com.hpe.WebDriver.WebDriverExtention.SelCustomFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalsMainPage {
    
    public WebDriver driver = null;
    
    private By dashboardTab = By.xpath(".//*[@id='link_2']");
    private By engineeringTab = By.xpath(".//*[@id='link_3']");
    private By releaseTab = By.xpath(".//*[@id='link_3']");
    private By prerelTab = By.xpath(".//*[@id='link_4']"); 
    private By devTab = By.xpath(".//*[@id='link_5']");
    private By administrationTab = By.xpath(".//*[@id='link_6']");
    //private By fpAdministrationTab = By.xpath(".//*[@id='link_42']");
    private By navBarPortalHeader = By.xpath(".//*[@id='navbar']/span");
    private By deploymentViewerTab = By.xpath(".//*[@id='link_22']");
    private By cpUserIcon = By.id("user-icon");
    private By groupLabel = By.id("grouprole");
    private By fpUserIcon = By.className("settings-toggle");
    private By fpUserAccountTab = By.xpath(".//*[@id='link_61']");
    private By cpAdministrationTab = By.xpath(".//*[@id='link_4']");
    private By cpUserAccountManager = By.xpath(".//*[@id='link_42']");
    private By cpLifecycleManager = By.xpath("//*[@id='link_43']");
    
    // Added for Content Publisher
    private By contentPubTile = By.id("32");
    
    public PortalsMainPage(WebDriver driver)    
    {
        this.driver = driver;
    }
    
    public String getDashBoardTabText()
    {
        return driver.findElement(dashboardTab).getText();
    }
    
    public String getReleaseTabText()
    {
        return driver.findElement(releaseTab).getText();
    }
    
    public String getPrelTabText()
    {
        return driver.findElement(prerelTab).getText();
    }

    
    public String getAdminTabText()
    {
        return driver.findElement(administrationTab).getText();
    }
    
    public String getDevTabText()
    {
        return driver.findElement(devTab).getText();
    }
    
    public String getPageTitle()
    {
        return driver.getTitle();
    }
    
    public void clickDashBoardsTab()
    {
        driver.findElement(dashboardTab).click();
    }
    
    //This method return the Text on the header to identify if the portal is Cloud Portal of Factory Portal
    public String getNavBarPortalText()
    {
        return driver.findElement(navBarPortalHeader).getText();
    }
    
    public void clickReleaseTab()
    {
        driver.findElement(releaseTab).click();
    }
    
    public void clickPreRelTab()
    {
        driver.findElement(prerelTab).click();
    }
    
    public void clickDevTab()
    {
        driver.findElement(devTab).click();
    }
    
    public void clickAdministrationTab()
    {
        driver.findElement(administrationTab).click();
    }

    public void clickCPAdministrationTab()
    {
        driver.findElement(cpAdministrationTab).click();
    }
    
    public void clickEngineeringTab()
    {
        driver.findElement(engineeringTab).click();
    }
    
    public void doubleClickOn(By locator)
    {
        SelCustomFramework.doubleClick(locator);
    }
    
    
    public void clickDeploymentViewerTab()
    {
        driver.findElement(deploymentViewerTab).click();
    }
    
    public void clickCPUserIcon()
    {
        driver.findElement(cpUserIcon).click();
    }
    
    public String getGroupLabelText()
    {
        return driver.findElement(groupLabel).getText();
    }
    
    public void clickFPUserAccountManagerTab()
    {
        driver.findElement(fpUserAccountTab).click();
    }
    
    public void clickCPUserAccountManagerTab()
    {
        driver.findElement(cpUserAccountManager).click();
    }
    
    public void clickFPUserIcon()
    {
        driver.findElement(fpUserIcon).click();
    } 
    
    public void getFactoryPortalUserGroupText()
    {
        driver.findElement(fpUserIcon).click();
    }
    
    public void clickCPUserAccountManager()
    {
        driver.findElement(cpUserAccountManager).click();
    }
    
    public void doubleClickOnTile(String tileName)
    {
    	if(tileName.equals("Content Publisher"))
    	{
    		SelCustomFramework.doubleClick(contentPubTile);
    	}
    }
    
    public void clickCPLifecycleManager()
    {
        driver.findElement(cpLifecycleManager).click();
    }
    
    public void waitForHeaderPresent(int timeout) throws Exception
    {
    	SelCustomFramework.waitForElementPresent(driver, navBarPortalHeader, timeout);
    }
    
    public void waitForFPAdministrationTab(int timeout) throws Exception
    {
    	SelCustomFramework.waitForElementPresent(driver, administrationTab, timeout);
    }
    
    public void waitForCPAdministrationTab(int timeout) throws Exception
    {
    	SelCustomFramework.waitForElementPresent(driver, cpAdministrationTab, timeout);
    }
}
