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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class ReleaseNotesPage {
    
    public WebDriver driver = null;
    
    private By releaseNotesHeader = By.xpath("html/body/header/span[2]");
    private By releaseNotesHeaderByCss = By.cssSelector("span.headtext");
    private By componentVersionByXpath = By.xpath("//*[@id='header-table']/tbody/tr[1]/td[2]");
    
    
    public ReleaseNotesPage(WebDriver driver)    
    {
        this.driver = driver;
    }
    
    public String getReleaseNotesHeaderText()
    {
        return driver.findElement(releaseNotesHeaderByCss).getText();
    }
    
    public boolean isReleaseNotesHeaderPresent()
    {
        return SelCustomFramework.isElementPresent(releaseNotesHeaderByCss);
    }
    
    public String getComponentVersion()
    {
        try
        {
            return driver.findElement(componentVersionByXpath).getText();
        }
        catch (NoSuchElementException e)
        {
            return "Version Not Available";
        }
        
    }
    
}
