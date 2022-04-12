Feature: Pre Condition

Scenario: Homepage Defaulth Login
 Given User is in stockbit-login Page
 When User Input login-email with <email>
 And User Input login-password with <password>
 And User Click login button
 Then home-page are Displayed
 
Scenario: Trading Page Login
Given User is in trading-login Page
When User Input trading-pin with <trading-pin>
And User Click login button
Then trading-page are Displayed
 
Examples:
|username			     |password	| trading-pin
|test99@gmail.com	 |123456		| 111111
|test123@gmail.com |12345     | 222222
 