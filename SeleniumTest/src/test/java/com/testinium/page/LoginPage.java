package com.testinium.page;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public  LoginPage(){
        methods=new Methods();
    }
    public void  login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"rim.alsara@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"),"123456**R");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));

    }
}