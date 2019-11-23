Feature: Free CRM FogotPasswordPage test

Scenario: validate Free CRM ForgotPassword Page test


Given user opens browser 
Then user is on login page
Then user cliks on Forgot your password? link
And user reset password 
Then user sees the reset password success message
Then user close the browser


