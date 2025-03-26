Feature: User Registration

Background:
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User click on create account button

Scenario: To check invalid data registration
And User enters '<First name>' the First name
And User enters '<Last name>' the Last name
And User enters '<Email>' the email
And User enter '<Password>' the password
And User enter Invalid '<Confirm Password>' the confirm Password
And User enter '<WhastsUp Number>' the whatsup Number
And User click on the create an Account button
Then User verify an error message
And User closes the browser

Scenario Outline: To check User registration with valid data
And User enters '<First name>' the First name
And User enters '<Last name>' the Last name
And User enters '<Email>' the email
And User enter '<Password>' the password
And User enter  '<Confirm Password>' the confirm Password
And User enter '<WhastsUp Number>' the whatsup Number
And User click on the create an Account button
Then User verify an error message
And User closes the browser

 Examples:
|First name|Last name|Email|Password|Confirm Password|WhatsUp Number|
|Prathap|Beri|prathapberi@gmail.com|Prathap@123|Prathap@123|9100643926|