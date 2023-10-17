Feature: Conversion of values from the units of measurement of the American system to meters
  I want to be able to translate the value in the selected unit of measurement of the American system into meters

  @inch
  Scenario: Convert inches to meters
    Given Execute conversion to meters and entered the value 2.0
    When Will be selected unit of change 1
    Then We should get value 0.05

  @foot
  Scenario: Convert foot to meters
    Given Execute conversion to meters and entered the value 2.0
    When Will be selected unit of change 2
    Then We should get value 0.61

  @yard
  Scenario: Convert yard to meters
    Given Execute conversion to meters and entered the value 2.0
    When Will be selected unit of change 3
    Then We should get value 1.8

  @mile
  Scenario: Convert mile to meters
    Given Execute conversion to meters and entered the value 2.0
    When Will be selected unit of change 4
    Then We should get value 3200.0
