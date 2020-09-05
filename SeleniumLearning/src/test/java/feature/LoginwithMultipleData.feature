Feature: Service NowLogin 
Background: 
	Given Launch browswer 
	And load url 
	And maximize the window 
	
Scenario Outline: Login serviceNow 
	When user enter username "<username>" 
	And user enter password "<password>" 
	And click login button 
	Then home page loaded 
	And close browser 
	Examples: 
		|username|password|
		|admin|Pass@123|
		|shefali|hello|
		
