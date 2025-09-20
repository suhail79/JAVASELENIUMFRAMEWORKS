Feature: User try to login into Adactin Hotel page

  Scenario Outline: User need to verify the login credentials to book the hotel
    Given User launch the URl
    When once launched user enters the "<Username>"
    When User enters the "<Password>"
    And user try to maximize the window
    And User try to click the login button
    Then user verifies the login functionality successful
    Then user has to quit the browser
    #Then user has to click logout after some time

    Examples:
      | Username            | Password  |
      | suhail001@gmail.com | suhail001 |
      | suhail002@gmail.com | suhail002 |
      | suhail79            | T9R4N3    |
      | suhail004@gmail.com | suhail004 |