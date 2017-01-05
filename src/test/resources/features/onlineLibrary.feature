Feature: Shopping for books

  Scenario:
    Given I go to "http://www.fasttrackit.org/OnlineLibrary/"
   And I go to shop section in the menu bar
   And I sort books by highest price first
   And I check if the listing is by price decrease
   And I sort books by lowest price first
   And I check if the listing is by price growth
   And I click on the product with price lower than "10" GBP
   And I go to Reviews and I add a review
   Then I go on Contact section of the menu and I send a message


  Scenario:
    Given  I go to "http://www.fasttrackit.org/OnlineLibrary/"
    And I go to Online Store section of the menu
    And I add to cart the first and the last products
    And I go to view cart items
    Then I checkout

