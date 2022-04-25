Feature: About you
  In order to gather basic personal information about applicants
  As a Policy Expert actuary
  I want users to provide their details

  Scenario Outline: User can provide basic information
    # really don't do this as a final test, but useful to get started
    Given "<actor>" is on the About You form
    And "<actor>" has selected "<pronoun>" title as "<title>"

    Examples:
      | actor  | title |pronoun|
      | Trevor | Mr      |his  |