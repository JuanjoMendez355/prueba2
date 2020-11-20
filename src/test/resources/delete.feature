@delete
  Feature: Create Delete operation to delete a course by "_ID" on mongoDB
    if the "_ID" is not found, return NOT FOUND exception (custom exceptions)

  Background: Create Course
  Given course and get course information


  @deleteP1
  Scenario: The API Recived a delete method with ID
    Given check course in mongoDB and ID course
    And I prepare the delete resource
    When I try delete a course on the API
    Then the API should indicate status no content

  @deleteP2
  Scenario: The API Recived a delete method with random ID
    Given I have a random ID
    And I prepare the delete resource
    When I try delete a course on the API
    Then the API should indicate status not found

  @deleteP3
  Scenario: The API Recived a delete method with ID and category
    Given check course in mongoDB and tabs id and category
    And I prepare the delete resource
    When I try delete a course on the API
    Then the API should indicate status no content

  @deleteP4
  Scenario: The API Recived a delete method with ID and status
    Given check course in mongoDB and tabs id and status
    And I prepare the delete resource
    When I try delete a course on the API
    Then the API should indicate status no content

  @deleteP5
  Scenario: The API Recived a delete method with description and title
    Given check course in mongoDB and tabs description and title
    And I prepare the delete resource
    When I try delete a course on the API
    Then the API should indicate status no content
