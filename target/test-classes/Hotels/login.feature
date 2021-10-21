Feature: Login
  # comment - In feature file, first line should either contain Feature keyword or a tag

  # Verify login button is enabled after launching the web-page
  Scenario: Verify login button is enabled by default
    Given I am on Homepage
    Then I verify login button is enabled
    And I quit Webpage

  #// Verify incorrect username/password
#  1. Launch WebPage
#  2. Enter "abcd@gmail.com" in username
#  3. Enter "abcd@1234" as password
#  4. Click Login button
#  5. User should be "Sorry, something went wrong." message
#  6. Quit webpage
#  */

  Scenario: Verify error message when for incorrect username or password
    Given I launch Facebook homepage
    When I enter 'abcd@gmail.com' in password
      And I enter 'abcd@1234'
      And I click login button
    Then I verify I see "Sorry, something went wrong." message
      And I quit Webpage
