Feature: Facebook login page Validation

#  Scenario: login the page with valid credentials
#   Given user try to launch facebook URL
#  When user enters username and password
# And user clicks the login button
# Then user verifies the login functionality


  Scenario Outline: login the page with multiple credentials
    Given user try to launch facebook URL
    When user enters "<Username>" and "<Password>"
    And user clicks the login button
    Then user verifies the login functionality
    Then user has to quit the browser

    Examples:
      | Username            | Password  |
      | suhail001@gmail.com | suhail001 |
      | suhail002@gmail.com | suhail002 |
      | suhail003@gmail.com | suhail003 |
      | suhail004@gmail.com | suhail004 |