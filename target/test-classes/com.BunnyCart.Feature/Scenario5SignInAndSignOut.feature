Feature:
Scenario: To check User click on sign out
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User click on sign in
And User enters valid '<Email>' email 
And User enters valid '<Password>' password 
And User click on sign in button
And User click on sign out button
And User closes the browser

Examples:
|Email|Password|
|veenaprathapberi@gmail.com|Veena@2001|