Feature: Hotel booking page feature

Scenario: Booking flow from Homepage to the Payment-page without completing the payment procedure
Given user is on Almatar home page
Then user clicks on App lanuage as English link
Then user clicks on Hotels tab
When user enter goingTo "Cairo, Egypt" and select the country from dropdown
Then user select the checkIn_CheckOut dates
And user select the travallers
Then user click on search icon
Then user click on available room button
When user click on book now button
Then user select title of the name
Then user enter firstName "Muztaba"
And user enter lastName "ALam"
And User enter emailId "muztaba@test.com"
And user enter phone number "111234567"
Then user select dates of DOB
Then user select month of DOB
And user select year of DOB
Then user click on continue button
When user on Payment page
Then user enter card holderName "Muztaba"
Then user enter cardNumber "4263982640269299"
And user enter expiryDate "02/23"
And user enter cvvCode "837"
Then user close the browser