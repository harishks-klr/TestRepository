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

public class ReportsPage {
    
    WebDriver driver = null;
    private By repSettingsCancelButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/footer/button[2]/span");
    private By repPageHeader = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/span/span[2]");
    
    
    public ReportsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    public void clickRepCancelButton()
    {
        driver.findElement(repSettingsCancelButton).click();
    }
    
    public boolean isrepPageHeaderPresent()
    {
        return (SelCustomFramework.isElementPresent(repPageHeader));
    }
    
    
}
