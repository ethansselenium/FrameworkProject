Feature: Login to Gmail Account for a project
Scenario: login

Given user is on login page
When user enters credentials
And user click on login button
Then user is on home page
