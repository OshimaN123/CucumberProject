$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid creddentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters userName as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.User_enters_userName_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on BankCash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_On_BankCash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on NewAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_On_NewAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on AddNewAccountpage",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_AddNewAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountTitle as \"Techfios Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_accountTitle_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters description as \"abc456\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialBalace as \"9283\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_initialBalace_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters AccountNumber as \"93844\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_AccountNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters ContactPerson as \"Techfios\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_ContactPerson_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phoneNumber as \"9938\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_phoneNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetbanking Url as \"https://techfios.com/billing/?ng\u003daccounts/add/\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_internetbanking_Url_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Submit NewAccount Form",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.User_Submit_NewAccount_Form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on manage account page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_manage_account_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [] but found [Manage Account]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat steps.LoginStepDefinition.user_should_land_on_manage_account_page(LoginStepDefinition.java:141)\r\n\tat ✽.User should land on manage account page(classpath:features/TechfiosLogin.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});