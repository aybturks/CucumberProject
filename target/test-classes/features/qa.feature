
Feature: Qa Symund Pages Tests

  Scenario:
    Given User should be already qa dashboard page
    When User click "<files>" button
    And User click "<deleted>" button
    And User Click "<deleted1>" button on "page"
    Then User should display "deleted" files




