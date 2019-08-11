package com.estore.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        //System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/eStore/");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();

    }
    @Test
    public void validLoginTest()
    {
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[1]/a")).click();
        driver.findElement(By.id("username")).sendKeys("abc");
        driver.findElement(By.id("password")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

    }
}
