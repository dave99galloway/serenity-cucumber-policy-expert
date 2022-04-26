Feature: About you
  In order to gather basic personal information about applicants
  As a Policy Expert actuary
  I want users to provide their details

  Scenario Outline: User can provide basic information
    # really don't do this as a final test, but useful to get started
    Given "<actor>" is on the About You form
    And "<actor>" has selected "<pronoun>" title as "<title>"
    And "<actor>" has entered "<actor>" as "<pronoun>" first name
    And "<actor>" has entered "<lastname>" as "<pronoun>" last name
    And "<actor>" has entered "<dob>" as "<pronoun>" date of birth
    And "<actor>" has selected "<maritalStatus>" as "<pronoun>" marital status
    And "<actor>" has selected "<occupation>" as "<pronoun>" occupation
    And "<actor>" has selected "<otherOccupations>" from the other occupations question
    And "<actor>" has entered "<phoneNumber>" as "<pronoun>" primary phone number

    Examples:
      | actor  | title | pronoun | lastname | dob        | maritalStatus |occupation|otherOccupations|phoneNumber|
      | Trevor | Mr    | his     | McTrevor | 10 09 1992 | Married       |Journalist|No              |07123456789|
