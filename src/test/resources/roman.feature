Feature: Convert Roman units to meters
  User wants to convert values to meters

  @palec
  Scenario: Palec to meters
    Given Execute conversion to meters and user entered the value 1.0
    When Will enter point 1
    Then We should get the 0.0185

  @foot
  Scenario: Foots to meters
    Given Execute conversion to meters and user entered the value 1.0
    When Will enter point 2
    Then We should get the 0.2957

  @palm
  Scenario: Palms to meters
    Given Execute conversion to meters and user entered the value 1.0
    When Will enter point 3
    Then We should get the 0.0739

  @akt
  Scenario: Akts to meters
    Given Execute conversion to meters and user entered the value 1.0
    When Will enter point 4
    Then We should get the 35.5

  @lokots
  Scenario: Lokots to meters
    Given Execute conversion to meters and user entered the value 1.0
    When Will enter point 5
    Then We should get the 0.444


