@FunctionalTest
Feature: Phptravel Vacation 

	As a User
    I need to create Account Fisrt
    So i can search fly hotel and more 

Scenario: Create an Account 
	Given User at PhpTravel Homepage 
	And User Should Start Create Account 
	When User Need Fill out Personal Infomation 
	Then User Succeful Login to thier Profile