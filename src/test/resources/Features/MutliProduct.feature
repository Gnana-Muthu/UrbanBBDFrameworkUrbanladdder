Feature: Multi Search Products

Scenario Outline:  Multi Search Test Scenario
Given Browser is ON
Given website is Connected
When User Search Multi Products like "<Products>"
Then Drivers is at End Stage

Examples:
	|Products|
	|Chair|
	|Table|