Feature: QTRecognition Login
Scenario Outline: HomePage Login
Given Initialise the browser with chrome
And Navigate to " https://qtrecognition.testqtwiz.com/" site
When User enters <username> and <password> 
Then Click on Login button

Examples:
|username  | password   |
|deepitha.jagatheesan@qualitestgroup.com  |P@ssw0rd   |
|deepitha.jagatheesn@qualitestgroup.com  |P@ssw0rd   |
