Feature: at-university-api-qe update operation

  @Scenario1
  Scenario: Update all courses from endpoint
    Given I have an ID to update a course
    And I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  #ID---------------------------------------------------
  @Scenario2
  Scenario: Update courses usign an id as capital letters
    Given I get an id as capital letters for update
    And I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario3
  Scenario: Update courses usign an id as numeric
    Given I have an id as numeric for update
    And I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario4
  Scenario: Update courses usign an id as boolean
    Given I have an id as boolean for update
    And I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario5
  Scenario: Update courses usign an id as null
    Given I have an id as null for update
    And I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  #CATEGORY----------------------------------------
  @Scenario6
  Scenario: Update cousers usign an category as capital letters
    Given I have an category as capital letters for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '400'

  @Scenario7
  Scenario: Update cousers usign an category as numeric
    Given I have an category as numeric for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '400'

  @Scenario8
  Scenario: Update cousers usign an category as boolean
    Given I have an category as boolean for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '400'

  @Scenario9
  Scenario: Update cousers usign an category as null
    Given I have an category as null for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '404'

  #TITLE----------------------------------------------
  @Scenario10
  Scenario: Update courses usign an title as capital letters
    Given I have an category for update
    And I have an title as capital letter for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario11
  Scenario: Update courses usign an title as numeric
    Given I have an category for update
    And I have an title as numeric for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario12
  Scenario: Update courses usign an title as boolean
    Given I have an category for update
    And I have an title as boolean for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario13
  Scenario: Update courses usign an title as null
    Given I have an category for update
    And I have an title as null for update
    And I have an description for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  #DESCRIPTION------------------------------------------
  @Scenario14
  Scenario: Update courses usign an description as capital letters
    Given I have an category for update
    And I have an title for update
    And I have an description as capital letters for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario15
  Scenario: Update courses usign an description as numeric
    Given I have an category for update
    And I have an title for update
    And I have an description as numeric for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario16
  Scenario: Update courses usign an description as boolean
    Given I have an category for update
    And I have an title for update
    And I have an description as boolean for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario17
  Scenario: Update courses usign an description as null
    Given I have an category for update
    And I have an title for update
    And I have an description as null for update
    And I have an img for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  #IMG---------------------------------------------------
  @Scenario18
  Scenario: Update courses usign an img as capital letters
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img as capital letters for update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario19
  Scenario: Update courses usign an img as numeric
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for as numeric update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario20
  Scenario: Update courses usign an img as boolean
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for as boolean update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  @Scenario21
  Scenario: Update courses usign an img as null
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for as null update
    And I have an status for update
    When I update sprint using PUT operation
    Then I should return an status '200'

  #STATUS-------------------------------------------------
  @Scenario22
  Scenario: Update courses usign an status as capital letters
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status as capital letters for update
    When I update sprint using PUT operation
    Then I should return an status '404'

  @Scenario23
  Scenario: Update courses usign an status as numeric
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status as numeric for update
    When I update sprint using PUT operation
    Then I should return an status '400'

  @Scenario24
  Scenario: Update courses usign an status as boolean
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status as boolean for update
    When I update sprint using PUT operation
    Then I should return an status '404'

  @Scenario25
  Scenario: Update courses usign an status as null
    Given I have an category for update
    And I have an title for update
    And I have an description for update
    And I have an img for update
    And I have an status as null for update
    When I update sprint using PUT operation
    Then I should return an status '404'
