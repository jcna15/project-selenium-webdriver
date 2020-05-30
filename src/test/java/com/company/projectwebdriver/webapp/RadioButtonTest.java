package com.company.projectwebdriver.webapp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
    @Test
    public void choosingRadioButton(){
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///D:/Java%20Projects/project-selenium-webdriver/webapp/radiobuttonstest.html");
    }
}
