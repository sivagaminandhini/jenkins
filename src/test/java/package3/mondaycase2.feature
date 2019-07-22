 Feature: login
  Scenario: Success
   Given I want to open the url
   And click on signin button
   And I enter the "<name>" and "<password>"
      | name     | password     |   
      | AlexUser |     Alex@123 | 
      Then click on login button
        