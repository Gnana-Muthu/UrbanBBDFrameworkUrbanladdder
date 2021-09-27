Feature: Login to UrbanLadderWebsite

Scenario Outline: Login to UrbanLadderWebsite Test Scenario
Given Initialize the Browser
Given Navigate to website
Then Click Track and Login Track
When User login into application with "<username>" and "<password>"
Then Close Driver

Examples:
	|username|password|
	|gnanamuthugmg@gmailcom|muthuGMAHA0810|
