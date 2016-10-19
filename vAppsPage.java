/*
 * # Copyright (c) 2016, Hewlett-Packard Enterprise
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
import org.openqa.selenium.WebElement;


public class vAppsPage {
    
    WebDriver driver = null; 
      
    private By vAppByXpath;      // Dynamically assigned During the test
    private By vAppTileXpath;    // Dynamically assigned during the test 
    private By versionByXpath;   // Dynamically assigned during the test
    private By vAppRelnotes;     // Dynamically assigned during the test
    private int tab;             // Used to store define the tab where the vApp is located
    
    
    public vAppsPage(WebDriver driver, int tab)
    {
        this.driver = driver;
        this.tab = tab;
    } 
    
    public Integer getTab(){
    	return tab;
    }
    
    public boolean isRelNotesPresentAt(int divId)
    {
        setRelNotesDivId(divId);
        return SelCustomFramework.isElementPresent(vAppRelnotes);
    }
    
    public boolean isVappPresentAt(int divId)
    {
        setVAppDivId(divId);
        return SelCustomFramework.isElementPresent(vAppByXpath);
    }
    
    public boolean isVersionPresentAt(int divId)
    {
        setVersionDivId(divId);
        return SelCustomFramework.isElementPresent(versionByXpath);
    }
    
    public void setVAppDivId(int id)
    {
        vAppByXpath = By.xpath("//*[@id='tab" + this.tab + "']/div["+id+"]/div[1]/span[1]");              
    }
    
    public void setVAppTileDivId(int id)
    {
        vAppTileXpath = By.xpath("//*[@id='tab" + this.tab + "']/div["+id+"]/div[2]/img");
    }
    
    public By getVAppByXpath(){
    	return vAppByXpath;
    }
    
    public void setVersionDivId(int divId)
    {
        versionByXpath = By.xpath("//*[@id='tab" + this.tab + "']/div["+divId+"]/div[1]/span[2]");                    
    }
    
    public void setRelNotesDivId(int divId)
    {
        vAppRelnotes = By.xpath(".//*[@id='tab" + this.tab + "']/div["+divId+"]/div[1]/span[3]/img");
    }
    
    public String getVersion()
    {
        return driver.findElement(versionByXpath).getText();
    }
    
    public String getVAppText()
    {
        return driver.findElement(vAppByXpath).getText();
    }
    
    // This method opens the vApp mapped on vAppByXpath class field.
    public void openVApp() throws InterruptedException
    {
        SelCustomFramework.clickAndSwitchToOpenedWindow(vAppByXpath);
        Thread.sleep(4000);
    }
    
    // This method opens the VApp mapped on vAppIconXpath 
    public void openVAppByTile() throws InterruptedException
    {
        SelCustomFramework.doubleClickAndSwitchToOpenedwWindow(vAppTileXpath);
        Thread.sleep(4000);
    }
    
    public WebElement getElementTab(){
    	return driver.findElement(By.xpath("//*[@id='tab" + this.tab + "']"));
    }
    
}
