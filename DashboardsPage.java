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

public class DashboardsPage {
    
    WebDriver driver = null;
    private By relNotes = By.xpath(".//*[@id='tab2']/div[2]/div[1]/span[3]/img");
    private By dashboardHeader = By.xpath(".//*[@id='tab2']/div[1]/h3");
    private By dashboardRelNotes = null;
    private By cloudHealthDashboards = By.xpath("//*[@id=\"21\"]/img");
    private By dashboardByXpath = null;
    private By versionByXpath = null ;    
    
    public DashboardsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    
    public void setVersionDivId(int divId)
    {
        versionByXpath = By.xpath("//*[@id='tab2']/div["+divId+"]/div[1]/span[2]");
    }
    
    public String getVersion()
    {
        return driver.findElement(versionByXpath).getText();
    }
    
    public void setRelNotesDivId(int divId)
    {
        dashboardRelNotes = By.xpath(".//*[@id='tab2']/div["+divId+"]/div[1]/span[3]/img");
    }
    
    
    public void doubleClickRleaseNotesAndSwitchTowindow() throws InterruptedException
    {
        SelCustomFramework.doubleClickAndSwitchToOpenedwWindow(relNotes);
    }
    
    public boolean isDashboardsHeaderPresent()
    {
        return SelCustomFramework.isElementPresent(dashboardHeader);
    }
    
    public String getDashBoardsHeaderText()
    {
        return driver.findElement(dashboardHeader).getText();
    }
    
    public boolean isRelNotesPresentAt(int divId)
    {
        setRelNotesDivId(divId);
        return SelCustomFramework.isElementPresent(dashboardRelNotes);
    }
    
    public boolean isVappPresentAt(int divId)
    {
        setDashboardDivId(divId);
        return SelCustomFramework.isElementPresent(dashboardByXpath);
    }
    
    public boolean isVersionPresentAt(int divId)
    {
        setVersionDivId(divId);
        return SelCustomFramework.isElementPresent(versionByXpath);
    }
    
    
    public void setDashboardDivId(int id)
    {
        dashboardByXpath = By.xpath("//*[@id=\"" +id + "\"]");
    }
    
    public String getDashboardText()
    {
        return driver.findElement(dashboardByXpath).getText();
    }
            
    public void OpenReleaseNotes() throws InterruptedException
    {
        SelCustomFramework.clickAndSwitchToOpenedWindow(dashboardRelNotes);
        Thread.sleep(4000);
    }
    
    public void doubleClickAndSwitchToCloudHealthWindow() throws InterruptedException
    {
        SelCustomFramework.doubleClickAndSwitchToOpenedwWindow(cloudHealthDashboards);
        Thread.sleep(4000);
    }
    
    public void doubleClickAtAndSwitchToOpenedWindow(int DivId) throws InterruptedException
    {
        SelCustomFramework.doubleClickAndSwitchToOpenedwWindow(dashboardByXpath);
    }
    
}
