Feature: Login tests

  Background:
    Given Select URL

  Scenario Outline: validate invalid credentials
#    When Select add two Courses <User> and <Password>
    Then Validate error text <Text>
    Examples:
      | User     | Password  | Text      |
      | userName | password1 | Madonnads |