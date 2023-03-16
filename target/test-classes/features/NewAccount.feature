@DbLoginFeature @Regression
Feature: Techfios new account page functionality validation by extracting data from september2022 DDB 

@DBScenario1
Scenario: User should be able to login with valid credentials from DB
  Given User is on the techfios loginpage 
	When User enters the "username"  from DataBase
	When User enters the "password"  from DataBase
	And User clicks on "login"
	Then User should land on dashboard page
	



