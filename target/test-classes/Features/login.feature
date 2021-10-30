Feature: Verify

  @sanity @TC-17
  Scenario: Verify Past dates (if any) are disabled and Back button on current month is disabled
    Given I am on Hotels Homepage
    When  I click Check In
    And   I get disabled dates
    Then  I get the elements in text format
    And   I see if back button is disabled
    And   I quit

  @sanity @TC-18
  Scenario: Verify Guests
    Given I am on Hotels Homepage
    When  click guests
    And   update guest count to 4
    And   update kids count to 2
    And   select child's age as 4
    And   select second child's age as <1
    Then  I see if guest count is displayed
    And   I click apply
    Then  I verify total count
    And   I quit
  @sanity @TC-21
  Scenario: Verify error message for invalid sign in credentials
    Given I am on Hotels Homepage
    When  I click on Sign in
    And   I enter invalid email
    And   I enter invalid password
    Then  I click signIn box
    Then  I verify error message is displayed
    And   I quit
  @sanity @TC-19
  Scenario: Verify CHANGE DATES button is displayed at the end of search results
    Given I am on Hotels Homepage
    When  click Search Box and type 'Bora'
    And   select 'Bora Bora'
    And   I click Check In
    Then  I select Check-in date as '1'
    Then  I select Check-out date from calendar as '15'
    And   I click apply
    Then  I click Search Button
    Then  I scroll to bottom of page
    Then  I see if Change Dates button is enabled
    Then  I see if Change Dates button is displayed
    And   I quit
  @sanity @TC-20
  Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
    Given I am on Hotels Homepage
    When  I click on Sign in
    And   I click on sign up
    Then  Click Terms and Conditions
    Then  I click back to other page
    And   I click privacy and statement
    Then  I verify total tabs should be 3
    Then  I quit





















#Feature: Login
#
#  @sanity
#  Scenario: Verify when i pass invalid credentials error message will be
#  displayed
#    Given I am on the Hotel.com homepage
#    When I click the sign-in link
#    When I enter Invalid email
#    When I enter Invalid password
#    When I click on Sign-in button
#    Then I verify error message is displayed
#
##  Launch hotels website
##  Click on “Sign in” link
##  Enter invalid email address
##  Enter invalid password
##  Click on Sign in button
##  Verify error message is displayed.
#
#
#
