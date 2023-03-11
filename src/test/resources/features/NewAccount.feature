@NewAccountFeature @Regression
Feature: Techfios new account page functionality validation



@Scenario02 
Scenario: User should click on Bank and cash field and user should click on new account 
Given User is on the add new account page
When User enters accountTitle as "Techfios Login"
When User enters description as "abc456"
When User enters initialBalace as "9283"
When User enters AccountNumber as "93844"
When User enters ContactPerson as "Techfios"
When User enters phoneNumber as "9938"
When User enters internetbanking Url as "https://techfios.com/billing/?ng=accounts/add/"
Then User should land on manage account page