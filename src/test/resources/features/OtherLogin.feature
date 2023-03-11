@OtherLoginFeature @Regression
Feature: Other Techfios billing login page functionality validation
Background:
Given User is on the techfios login page 

@OtherScenario1
Scenario Outline: Other User Should not be able to Login with Invalid credential
When User enters userName as "<userName>"
When User enters password as "<password>"
When User clicks on sign in button 
Then User should land on dashboard page
Examples:

|   userName                |    password     |
|   demo2@techfios.com      |   abc123        |
|   demo@techfios.com       |   abc124        |
|   demo2@techfios.com      |   abc124        |
|                           |                 |
 

 

