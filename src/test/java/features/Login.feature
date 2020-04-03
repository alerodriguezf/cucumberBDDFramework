Feature: Login
  I want to log in on the website

  Scenario: Go to the login page to perform the log in process
    Given   User is on the website home page
    When    User clicks on the log in button
    Then    Website redirects user to the log in page


  Scenario Outline: Introduce wrong credentials to log in
    The name must to have between 3 and 8 characters
    Given   User is on the website login page
    When    User enters his username at username box "<username>"
    And     User enters his "<password>" at password box
    And     User clicks on the log in button at login page
    Then    Website shows "<usernameErrorMessage>" and "<passwordErrorMessage>"
    Examples:
      | username                  | password      | usernameErrorMessage       | passwordErrorMessage             |
      |                           |               | Name is a required field.  | Password is a required field.|
      | pe                        | Password15!   | Name is a required field.  |                              |
      | pep                       | Password15!   |                            |                              |
      | pep456!                   | Password15!   |                            |                              |
      | pep pon                   | Password15!   | Name is a required field.  |                              |
      | pep45678                  | Password15!   |                            |                              |
      | pep456789                 | Password15!   | Name is a required field.  |                              |


