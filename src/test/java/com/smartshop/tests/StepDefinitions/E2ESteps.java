package com.smartshop.tests.StepDefinitions;

import com.smartshop.framework.driver.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.smartshop.tests.Pages.HomePage;
import com.smartshop.tests.Pages.ProductPage;
import com.smartshop.tests.Pages.CartPage;


public class E2ESteps {


    WebDriver driver = DriverManager.getDriver();

    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Given("user is on the SmartShop home page")
    public void user_is_on_the_smart_shop_home_page() {
        driver.get("https://www.demoblaze.com");
    }

    @When("user selects {string} category")
    public void user_selects_category(String category) {
        homePage.selectCategory(category);
    }

    @When("user selects product {string}")
    public void user_selects_product(String product) {
        homePage.selectProduct(product);
    }

    @When("user adds the product to the cart")
    public void user_adds_the_product_to_the_cart() {
        productPage.addProductToCart();
    }

    @Then("product should be visible in the cart")
    public void product_should_be_visible_in_the_cart() {
        cartPage.navigateToCart();
        Assert.assertTrue(cartPage.isProductDisplayed(),
                "Product is NOT visible in cart");
    }
}
