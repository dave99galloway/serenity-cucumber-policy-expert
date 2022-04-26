Feature: Other Residents
  In order to capture information about all the occupants
  As a Policy expert actuary
  I want applicants to be able to enter statements about residents

  Scenario: Applicant has nothing to declare
    Given "Trevor" has completed the About You page
    And "Trevor" has confirmed there are no declarations to make
    When "Trevor" the Next button on the About You and other residents form
    Then "Trevor" is redirected to the About Your Property page