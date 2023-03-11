@LoginFeature @Regression
Feature: Techfios billing login page functionality validation

@Scenario1 
Scenario: User should be able to login with valid creddentials
When User enters userName as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on sign in button 
Then User should land on dashboard page 
And User clicks on BankCash
And User clicks on NewAccount
Then User should land on AddNewAccountpage
And User enters accountTitle as "Techfios Login"
And User enters description as "abc456"
And User enters initialBalace as "9283"
And User enters AccountNumber as "93844"
And User enters ContactPerson as "Techfios"
And User enters phoneNumber as "9938"
And User enters internetbanking Url as "https://techfios.com/billing/?ng=accounts/add/"
And User Submit NewAccount Form
Then User should land on manage account page
