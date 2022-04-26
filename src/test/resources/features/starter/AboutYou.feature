Feature: About you
  In order to gather basic personal information about applicants
  As a Policy Expert actuary
  I want users to provide their details

  Scenario Outline: User can provide basic information (Compact)
    Given "<actor>" is on the About You form
    When "<actor>" enters this data in the About You form:-
    #prefer to use a vertical table for readability but this is quicker to set up
      | title   | pronoun   | firstname   | lastname   | dob   | maritalStatus   | occupation   | otherOccupations   | phoneNumber   | email   |
      | <title> | <pronoun> | <firstname> | <lastname> | <dob> | <maritalStatus> | <occupation> | <otherOccupations> | <phoneNumber> | <email> |

    Then "<actor>" is redirected to the other residents page

    Examples:
      | actor  | title | pronoun | firstname | lastname | dob        | maritalStatus | occupation | otherOccupations | phoneNumber | email                   |
      | Trevor | Mr    | his     | Trevor    | McTrevor | 10 09 1992 | Married       | Journalist | No               | 07123456789 | vketipisz@qmetric.co.uk |

  @Ignore
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
    And "<actor>" has entered "<email>" as "<pronoun>" email address
    And "<actor>" clicks the Next button on the About You form

    Examples:
      | actor  | title | pronoun | lastname | dob        | maritalStatus | occupation | otherOccupations | phoneNumber | email                   |
      | Trevor | Mr    | his     | McTrevor | 10 09 1992 | Married       | Journalist | No               | 07123456789 | vketipisz@qmetric.co.uk |
