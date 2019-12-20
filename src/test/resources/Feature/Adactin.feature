@Adactin
Feature: To validate adactin hotel app

  @tag1
  Scenario: To check Adactin hotel booking functionality is working as per requirement
    Given launch brouser and open application
    When Enter credential and click login
      | 8807879064 | jayprakash |
    And Enter room details and click search
    And Select hotel and click continue
    And Enter personal details and click Book
    And Complete all procedure for cancellation and click logout
    Then Logout succesfully and Home page opens
