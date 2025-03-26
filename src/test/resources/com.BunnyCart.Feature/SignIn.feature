Feature: 
Scenario Outline: To check the signin account page with valid and invalid data
Given User opens the browser
And User navigates to the application Url "https://www.bunnycart.com"
When User clicks the link homepagesignin an account
And User enters a invalid '<InvalidEmail>' in email textbox
And User enters a valid '<Password>' in password textbox
And User clicks signin  account button.
#Then User verifies the error message displayed under the email textbox
When User re-enters a email with valid data '<ValidEmail>'
And User clicks signin button.
And User closes the browser
Examples: 
|InvalidEmail|Password|ValidEmail|
|veenaberi.com|Veena@2001|veenaprathapberi@gmail.com|