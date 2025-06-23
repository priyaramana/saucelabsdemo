Feature: Login feature

Scenario Outline: Login with creds
  Given User is on login page
  When User enters username "<username>" and password "<password>"
  And clicks on Login button
  Then User should navigate to home page

  Examples:
    | username      | password     |
    | standard_user | secret_sauce |
    | error_user    | secret_sauce |
    | problem_user  | secret_sauce |

Scenario: LoginWithoutPass
 Given User is on login page
 When user enters password "secret_sauce"
 And click on login button
 Then error message should display
 
Scenario: LoginWithoutUser
 Given User is on login page
 When user enters username "standard_user"
 And click on login button
 Then user error message should display