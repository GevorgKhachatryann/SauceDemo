@login
  @test
Feature: Test Entering Credentials
#  As an online shopper, users must sign in with valid credentials

  Background: Navigate to the home page
    Given saucedemo page is opened


  Scenario Outline: Verify valid users can sign in
    When The user provides the username as "<username>" and password as "<password>"
    And The user click on Login btn
    Then inventory page is opened
    Examples:
      |username       |password     |
      |standard_user  |secret_sauce |
      |problem_user   |secret_sauce |
      |locked_out_user|secret_sauce |


  Scenario Outline: Verify invalid users cannot sign in
    When The user provides the username as "<username>" and password as "<password>"
    And The user click on Login btn
    Then inventory page is not opened
    Examples:
      |username       |password     |
      |fake_user      |fake_user1   |

