Feature: Hotel booking page feature

Scenario: Open Almatar URL, book the hotel without payment flow
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
