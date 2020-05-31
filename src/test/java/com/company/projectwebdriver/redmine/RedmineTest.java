package com.company.projectwebdriver.redmine;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.pages.RedmineHomePage;
import com.company.projectwebdriver.pages.RedmineLoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedmineTest extends BaseTest {
    @BeforeAll
    public static void launchApp(){
        driver.get("http://cesar-pc:81/redmine/login");
    }

    @Test
    public void loginRedmine(){
        String username = "jnavarro";
        String password = "jnavarro";
        String expectedUser = "Conectado como jnavarro";

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(driver);
        RedmineHomePage redmineHomePage =  redmineLoginPage.login(username, password);

        String userActual = redmineHomePage.getUserLogged();

        assertEquals(expectedUser, userActual);

    }

    @Test
    public void Login() {

        assertEquals("Redmine", driver.getTitle(), "El título de la pagina no es el correcto");

        WebElement linkLogin = driver.findElement(By.linkText("Iniciar sesión"));
        linkLogin.click();

        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("jnavarro");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("jnavarro");

        WebElement btnsubmit = driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
        btnsubmit.click();

        WebElement lblLogin = driver.findElement(By.xpath("//*[@id=\"loggedas\"]"));
        String actualUser = lblLogin.getText();
        String expectedUser = "Conectado como jnavarro";

        assertEquals(expectedUser,actualUser,"El usuario se logeo incorrectamente");

        driver.quit();
    }
}
