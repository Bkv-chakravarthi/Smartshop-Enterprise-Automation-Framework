package com.smartshop.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    By cartLink = By.id("cartur");
    By cartRows = By.xpath("//tr[@class='success']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToCart() {
        driver.findElement(cartLink).click();
    }

    public boolean isProductDisplayed() {
        wait.until(ExpectedConditions
                .presenceOfElementLocated(cartRows));
        return driver.findElements(cartRows).size() > 0;
    }
}
