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


public class FactoryPortalMainPage {
    
    public WebDriver driver = null;
    private By dashboardTab = By.xpath(".//*[@id='link_2']");
    private By releaseTab = By.xpath(".//*[@id='link_3']");
    private By prerelTab = By.xpath(".//*[@id='link_4']");
    private By devTab = By.xpath(".//*[@id='link_5']");
    private By administrationTab = By.xpath(".//*[@id='link_6']");
    private By factoryPortalTitle = By.xpath("//*[@id='navbar']/span");

	public FactoryPortalMainPage(WebDriver driver)    
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
    
    public String getFactoryPortalTitle() 
    {
		return driver.findElement(factoryPortalTitle).getText();
	}
}
