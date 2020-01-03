Feature: Adactin Tasks

Scenario: Task 1 -Login

Given User launch Adactin web page
Then Check page title relevance - Login Page
When User enter email id in username field
And User enter password in password field
And User click login button
Then Check page title relevance - Booking page

@Ignore
Scenario: Check if Logged out or not

Given User click logout button
Then User check if account logged out or not
Then User closes the browser

@Ignore
Scenario: Booking a room

When User select Location
And User select Hotel
And User select Room type
And User select number of rooms
And User select check-in date
And USer select check-out date
And User specifies number of Adults per room
And User clicks search button




@Ignore
Scenario: Task 2 - Date Error Message

When User select Location
And User select Hotel
And User select Room type
And User select number of rooms
And User select check-in date
And User select check-out date earlier than check-in date
And User specifies number of Adults per room
And User clicks search button
Then User should get an error message that check-out date is earlier than check-in date
And User closes the browser

@Ignore
Scenario: Task 3 - Date format error Message

When User select Location
And User select Hotel
And User select Room type
And User select number of rooms
And User select check-in date
And User select check-out date using different format
Then Check if system throws date format error message
And User specifies number of Adults per room
And User clicks search button

 
@Ignore
Scenario: Tasks 4 to 13 - To Check whether all the selected details match with the details choosen

When User checks if the hotel name displayed is the same as choosen by user in previous page
And User checks if the location displayed is the same as choosen by user in previous page
And User checks if the number of rooms displayed is the same as choosen by user in previous page
And User checks if the Arrival date displayed is the same as choosen by user in previous page
And  User checks if the Departure date displayed is the same as choosen by user in previous page
And  User checks if the number of days displayed is the same as choosen by user in previous page
And  User checks if the Room Type displayed is the same as choosen by user in previous page
And  User checks if the Total price displayed is correct to the price per night specified by the website
When User clicks the radio button accepting hte selected the details
And User clicks the continue button to continue to Payment Page
Then Check page title relevance - Payment page
Then User closes the browser

@Ignore
Scenario: Task 9,14 Booking and payment completion, check if order num is generated or not

When User clicks the radio button accepting hte selected the details
And User clicks the continue button to continue to Payment Page
And User enters first name
And User enters Second name
And User enters billing address
Then User enters credit card number of 16 digits
Then User selects the card type
Then User selects expiry month of the card
Then User selects expiry year of the card
Then User enters CVV number of the card
And User clicks book now button
Then User checks if order number generated

@Ignore
Scenario: Task 15,16,17,18 - Itinerary editable or not and search orderID and 

Given User clicks on My Itinerary button below the Order ID
Then User tries to edit order number displayed on the page
Then User search OrderID in the search bar
Then User click the Go button
Then User check if the mentioned order id is displayed in the order id space
When User checks if the hotel name displayed is the same as choosen by user

@Ignore
Scenario: Task 19 - Cancel an order and check if the order is still present

Given User clicks on My Itinerary button below the Order ID
When User clicks cancel order id button
Then User search OrderID in the search bar
Then User click the Go button
Then User checks if the order is present in the list of orders
And User closes the browser









