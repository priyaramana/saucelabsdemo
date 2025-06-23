Feature: product page

  Scenario: Remove or Add Product
    Given User is on login page for product test
    When User enters product username "standard_user" and product password "secret_sauce"
    Then user should land on homepage after login
    And user is on product page
    When user clicks on remove CTA
    Then product should get removed from cart
    When user clicks on add to cart CTA
    Then product should get added to cart

  Scenario: Add second product to cart
    Given User is on login page for product test
    When User enters product username "standard_user" and product password "secret_sauce"
    Then user should land on homepage after login
    And user is on product page
    When user clicks on addtocart CTA on second product
    Then product should get added to cart

  Scenario: Print price of product
   Given User is on login page for product test
    When User enters product username "standard_user" and product password "secret_sauce"
    Then user should land on homepage after login
    And user is on product page
    When user navigates to SauceLabsBoltTShirt_Price
    Then price should get displayed
