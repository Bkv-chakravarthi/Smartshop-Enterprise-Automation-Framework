Feature: End to End Purchase Flow

  Scenario: User adds a product to cart successfully
    Given user is on the SmartShop home page
    When user selects "Phones" category
    And user selects product "Samsung galaxy s6"
    And user adds the product to the cart
    Then product should be visible in the cart