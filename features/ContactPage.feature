#Each feature contains one feature
#Feature files use Gherkin language - business language
Feature: Test contact page functionality

#A feature may have given different specific scenarios
#Scenarios use Given-When-Then Structure
Scenario: User should be able to submit contact info with valid information
Given user is on the contacts page
When user enters valid info in all required areas
Then the user gets confirmation
