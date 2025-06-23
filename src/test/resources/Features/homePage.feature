Feature: Home page


  Scenario: HomePage
    Given User is initially on login page
    When User enters valid username "standard_user" and valid password "secret_sauce"
    Then User should redirect to home page
    When user verifies the page title
    Then page title should be displayed