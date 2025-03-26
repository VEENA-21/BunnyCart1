Feature: 

Scenario: To check Sign In, search for a product, and add to cart
    Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User clicks on Sign In 
And User enter '<Email>' the email
And User enters '<Password>' the password
And User clicks on sign in button
    When User Search for a product "Dwarf hairgrass" in search textbox
And User select product from the search results
And User clicks on Netpot option
And User clicks on Add to Cart
Then User verifies that the product is added to the cart message
    When User searches for another product "Nitella" in the search textbox
    And User selects the nitella product from the search results
    And User clicks on Add to Cart
   Then User verifies that the product is added to the cart message
    And User closes the Browser

Examples:
    | Email                         | Password   |
    | veenaprathapberi@gmail.com    | Veena@2001 |
