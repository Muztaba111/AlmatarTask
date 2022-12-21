package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.HotelBookingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBookingSteps {

	private HotelBookingPage hotelBookingPage = new HotelBookingPage(DriverFactory.getDriver());

	@Given("user is on Almatar home page")
	public void user_is_on_almatar_home_page() {

	}

	@Then("user clicks on App lanuage as English link")
	public void user_clicks_on_App_lanuage_as_English_link() {

		hotelBookingPage.clickOnAppLang();
	}

	@Then("user clicks on Hotels tab")
	public void user_clicks_on_hotels_tab() {

		hotelBookingPage.clickOnHotelTab();

	}

	@When("user enter goingTo {string} and select the country from dropdown")
	public void user_enter_going_field_and_select_the_country_from_dropdown(String goingTo) {

		hotelBookingPage.enterGoingTo(goingTo);

	}

	@Then("user select the checkIn_CheckOut dates")
	public void user_select_the__checkIn_CheckOut_dates() {
		hotelBookingPage.select_CheckIn_CheckOut_Date();
	}

	@Then("user select the travallers")
	public void user_select_the_travallers() {

	}

	@Then("user click on search icon")
	public void user_click_on_search_icon() {
		hotelBookingPage.clickOnSearchIcon();
	}

	@Then("user click on available room button")
	public void user_click_on_available_room_button() {
		hotelBookingPage.clickOnIghHotelLink();

	}

	@When("user click on book now button")
	public void user_click_on_book_now_button() {
		hotelBookingPage.clickOnBookNow();
	}

	@Then("user select title of the name")
	public void user_select_title_of_the_name() {
		hotelBookingPage.selectTitle();

	}

	@Then("user enter firstName {string}")
	public void user_enter_firstName(String firstName) {

		hotelBookingPage.enterFirstName(firstName);
	}

	@Then("user enter lastName {string}")
	public void user_enter_last_name(String lastName) {
		hotelBookingPage.enterLastName(lastName);

	}

	@Then("User enter emailId {string}")
	public void user_enter_emailId(String emailId) {

		hotelBookingPage.enterEmailId(emailId);
	}

	@Then("user enter phone number {string}")
	public void user_enter_phone_number(String number) {
		hotelBookingPage.enterPhoneNumber(number);

	}

	@Then("user select dates of DOB")
	public void user_select_dates_of_dob() {
		hotelBookingPage.selectDOBDate();

	}

	@Then("user select month of DOB")
	public void user_select_month_of_dob() {
		hotelBookingPage.selectDOBMonth();
	}

	@Then("user select year of DOB")
	public void user_select_year_of_dob() {
		hotelBookingPage.selectDOBYear();

	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		hotelBookingPage.clickOnContinue();
	}
	@When("user on Payment page")
	public void user_on_payment_page() {
	    
	}

	@Then("user enter card holderName {string}")
	public void user_enter_card_holder_name(String holderName) {
	    
		hotelBookingPage.enterCardHolder(holderName);
	}

	@Then("user enter cardNumber {string}")
	public void user_enter_card_number(String cardNumber) {
		
		hotelBookingPage.enterCardNumber(cardNumber);
	    
	}

	@And("user enter expiryDate {string}")
	public void user_enter_expiry_date(String expiryDate) {
		
		hotelBookingPage.enterExpiryDate(expiryDate);
	   
	}

	@And("user enter cvvCode {string}")
	public void user_enter_cvv_code(String cvvCode) {
		
		hotelBookingPage.enterCvvCode(cvvCode);
	   
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
	   
	}


}
