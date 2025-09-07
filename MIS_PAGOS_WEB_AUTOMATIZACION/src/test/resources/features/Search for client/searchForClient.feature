Feature: Login tests

  Background:
    Given Select URL

  Scenario Outline: validate invalid credentials
    When select the search client option
    Then Validate error text <Text>
    Examples:
      | User     | Password  | Text                                                                   |
      | userName | password1 | La información no es válida. Por favor verifique los datos de ingreso. |