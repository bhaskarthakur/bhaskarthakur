#Author: your.email@your.domain.com
@googleApplication
Feature: Sample Google seaarch feature

  @googleApplication1
  Scenario: as a user i should be able to perform sucessful search
    Given I navigate to google home page
    And i enter the search creteria as "Computer"
    When I click on search button
    Then I should see the results
