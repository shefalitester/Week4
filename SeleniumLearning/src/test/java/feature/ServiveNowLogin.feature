Feature: ServiceNow Login 
Background:
	Given Launch browswer 
	And load url 
	And maximize the window 
	
Scenario: Login serviceNow 
	When user enter username as "admin"
	And user enter password as "Pass@123"
	And click login button
	Then home page loaded 
#	And close browser 
	
Scenario: LoginServiceNow(negative) 
	When user enter username as "shefali"
	And user enter password as ""
	But login should fail
#	And close browser ;b