@Get at-university-api-qe get operation

Feature: I need see my courses with the GET method

@Get1
  Scenario: Obtain all courses for to see
    Given I need see all courses
    When I send GET request to API
    Then Return an status '200'