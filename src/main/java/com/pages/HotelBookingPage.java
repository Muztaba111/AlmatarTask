package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.WaitHelper;

public class HotelBookingPage {

	private WaitHelper waitHelper;
	private WebDriver driver;

	private By appLanguage = By.xpath("//*[@id=\"rtl\"]/app-root/app-nav/nav/div/section/div[1]/app-language/a");
	private By hotelsTab = By.xpath("//a[@id=\"hotels\"]");
	private By goingToField = By.xpath("//input[@id=\"typeahead-http\"]");
	private By checkIn = By.xpath("//span [text()='Check in']");
	private By select_CheckInDate = By.xpath("//table[@class=\"month2\"]/tbody/tr[2]/td[4]/div");
	private By select_CheckInOut = By.xpath("//table[@class=\"month2\"]/tbody/tr[2]/td[6]/div");
	private By selctGoingToField = By.xpath("//*[@id=\"ngb-typeahead-0-0\"]/span/div[1]");
	private By searchIcon = By.xpath("//span[@class=\"icon-search\"]");
	private By ighHotelLink = By.xpath(
			"//*[@id=\"ltr\"]/app-root/app-child/div[3]/div/div[3]/div[2]/app-hotel-list-result/div[1]/div/div[2]/div/div[1]/div[1]/h6/a");
	private By bookNowButton = By.xpath("//button[@class=\"btn btn-succes\"]");
	private By title = By.xpath(
			"//*[@id=\"ltr\"]/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[1]/div/div/app-full-name/div/div[2]/ng-select/div");
	private By selectTitle = By.xpath("//span[text()=\"Mr\"]");
	private By first_Name = By.xpath("//input[@placeholder=\"First name\"]");
	private By last_Name = By.xpath("//input[@placeholder=\"Last name\"]");
	private By email = By.xpath("//input[@placeholder=\"email\"]");
	private By phoneNumber = By.xpath("//input[@placeholder=\"Phone Number *\"]");
	private By dobDate = By.xpath(
			"//*[@id=\"ltr\"]/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[1]/ng-select/div");
	private By selectDOBDate = By.xpath("//span[text()=\"04\"]");
	private By dobMonth = By.xpath(
			"//*[@id=\"ltr\"]/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[2]/ng-select/div");
	private By selectDOBMonth = By.xpath("//*[text()=\" February \"]");
	private By dobYear = By.xpath(
			"//*[@id=\"ltr\"]/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[3]/ng-select/div");
	private By selectDOBYear = By.xpath("//span[text()=\"2004\"]");
	private By continueButton = By.xpath("//*[text()=\"Continue\"]");

	public HotelBookingPage(WebDriver driver) {

		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}

	public void clickOnAppLang() {
		driver.findElement(appLanguage).click();
	}

	public void clickOnHotelTab() {
		driver.findElement(hotelsTab).click();
	}

	public void enterGoingTo(String goingTo) {

		driver.findElement(goingToField).sendKeys(goingTo);

		waitHelper.waitForElement(selctGoingToField);
		driver.findElement(selctGoingToField).click();

	}

	public void select_CheckIn_CheckOut_Date() {

		driver.findElement(checkIn).click();

		waitHelper.waitForElement(select_CheckInDate);
		driver.findElement(select_CheckInDate).click();
		driver.findElement(select_CheckInOut).click();

	}

	public void clickOnSearchIcon() {
		driver.findElement(searchIcon).click();
	}

	public void clickOnIghHotelLink() {
		waitHelper.waitForElement(ighHotelLink);
		driver.findElement(ighHotelLink).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator itr = handles.iterator();
		String parentId = (String) itr.next();
		String childId = (String) itr.next();
		driver.switchTo().window(childId);
	}

	public void clickOnBookNow() {
		waitHelper.waitForElement(bookNowButton);
		driver.findElement(bookNowButton).click();
	}

	public void selectTitle() {
		waitHelper.waitForElement(title);
		driver.findElement(title).click();
		waitHelper.waitForElement(selectTitle);
		driver.findElement(selectTitle).click();

	}

	public void enterFirstName(String firstName) {

		driver.findElement(first_Name).sendKeys(firstName);

	}

	public void enterLastName(String lastName) {

		driver.findElement(last_Name).sendKeys(lastName);

	}

	public void enterEmailId(String emailId) {

		driver.findElement(email).sendKeys(emailId);

	}

	public void enterPhoneNumber(String number) {

		driver.findElement(phoneNumber).sendKeys(number);

	}

	public void selectDOBDate() {

		waitHelper.waitForElement(dobDate);
		driver.findElement(dobDate).click();
		waitHelper.waitForElement(selectDOBDate);
		driver.findElement(selectDOBDate).click();

	}

	public void selectDOBMonth() {

		driver.findElement(dobMonth).click();
		waitHelper.waitForElement(selectDOBMonth);
		driver.findElement(selectDOBMonth).click();

	}

	public void selectDOBYear() {

		driver.findElement(dobYear).click();
		waitHelper.waitForElement(selectDOBYear);
		driver.findElement(selectDOBYear).click();

	}

	public void clickOnContinue() {

		driver.findElement(continueButton).click();

	}
}