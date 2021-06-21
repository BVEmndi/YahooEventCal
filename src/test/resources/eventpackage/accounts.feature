@1
Feature:Login Functionality

  Background: User should signed into yahoo account
  Scenario Outline: Verify login with valid credentials for Yahoo account
  Given User is in the sign in page
  When User click on sign in button
  And User provide "<username>" and "<password>"
  Then User should login into yahoo and see his account name

  Examples:
  |username|password|message|
  |FirstTestLogin_12|TestAbc_12!|                                           |
  #|SecondTestLogin|TestAbc_12!|Sorry, we don't recognise this email address.|
  #|ThirdTestLogin|TestAbc_12!|Sorry, we don't recognise this email address.|