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

public class DashboardsPopupWindowPage {
    
    WebDriver driver = null;
    private By dashboardWindowHeader = By.xpath("//*[@id=\"navbar\"]/span");

    
    public DashboardsPopupWindowPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    public String getDashboardWindowHeaderText()
    {
        return driver.findElement(dashboardWindowHeader).getText();
    }
    
    public boolean isHeaderTextPresent()
    {
       return SelCustomFramework.isElementPresent(dashboardWindowHeader);       
    }
    
     
}
