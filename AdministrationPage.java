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

public class AdministrationPage {
    
    WebDriver driver = null;
    private By administrationHeader = By.xpath(".//*[@id='tab6']/div[1]/h3");
        
    public AdministrationPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String getAdministrationHeaderText()
    {
        return driver.findElement(administrationHeader).getText();
    }
        
}
