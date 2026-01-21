package com.smartshop.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectCategory(String categoryName) {
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.linkText(categoryName)))
                .click();

        // wait for products to reload
        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By.cssSelector(".card-title")));
    }

    public void selectProduct(String productName) {
        By productLocator = By.linkText(productName);

        int attempts = 0;
        while (attempts < 2) {
            try {
                wait.until(ExpectedConditions
                                .elementToBeClickable(productLocator))
                        .click();
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
    }
}
