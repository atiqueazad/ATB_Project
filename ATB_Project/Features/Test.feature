@login
Feature: Email will be delivered to the AgileTrailblazers management team

Scenario Outline: Sucessfully Sending The message

Given User visit homepage

When User enter name "<Name>" 
And email adress "<EmailAdd>" 
And mobilePhone "<MPN>"
And User Select subject 
And User Enter message 
And User  Click submit button 
Then User recives a confirmation message 

Examples:

|Name| EmailAdd| MPN |
|Atique| atique7142@gmail.com|3473937748|





