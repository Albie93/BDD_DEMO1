Feature: Test Facebook login functionality 

Scenario Outline: Test login 
	Given open firefox and navigate to facebook website 
	When I enters the "<username>" and "<password>" 
	Then User should be able to login Successfully 
	
	Examples: 
		| username | password |
		| Amit@hghjgj.com | amitttr |
		| Amit@hvghjgj.com | amitttkkr |
		| Amit@hhghjgj.com | amithhttr |