package org.com.stepdefinition;

import org.com.pages.CardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	@Given("open card page")
	public void open_card_page() {
		CardPage.openPage();
	}

	@When("user accept cookies")
	public void user_accept_cookies() {
		CardPage.acceptCookies();

	}

	@When("user clicks cartes american express")
	public void user_clicks_cartes_american_express() {

		CardPage.clickCartsAmericanExpress();
	}

	@When("user clicks en savoir plus under carte gold american express")
	public void user_clicks_en_savoir_plus_under_carte_gold_american_express() {
		CardPage.clickSavior();

	}

	@When("user clicks Demandez votre Carte")
	public void user_clicks_demandez_votre_carte() {

		CardPage.clickDemandez();
	}

	@When("user select gender")
	public void user_select_gender() throws InterruptedException {
		CardPage.selectGender();

	}

	@When("user enter first name")
	public void user_enter_first_name() {
		CardPage.enterFirstName();

	}

	@When("user enter last name")
	public void user_enter_last_name() {
		CardPage.enterLastName();

	}

	@When("user enter date of borth")
	public void user_enter_date_of_borth() {

		CardPage.enterDOB();
	}

	@When("user enter email address")
	public void user_enter_email_address() {
		CardPage.enterEmail();

	}

	@When("user select country code")
	public void user_select_country_code() {
		CardPage.selectCountryCode();

	}

	@When("user enter mobile number")
	public void user_enter_mobile_number() {
		CardPage.enterMobileNumber();

	}

	@When("user clicks submit")
	public void user_clicks_submit() {
		CardPage.submit();

	}

	@When("user confirm birth name same as current name")
	public void user_confirm_birth_name_same_as_current_name() throws InterruptedException {
		CardPage.clickCheckBoxName();

	}

	@When("user enter place of birth")
	public void user_enter_place_of_birth() {
		CardPage.enterBirthPlace();

	}

	@When("user select birth department")
	public void user_select_birth_department() {
		CardPage.selectBirthDepartment();

	}

	@When("user select country")
	public void user_select_country() {
		CardPage.selectCountry();

	}

	@When("user select nationality")
	public void user_select_nationality() {

		CardPage.selectNationality();
	}

	@When("user select territory")
	public void user_select_territory() {

		CardPage.selectTerritory();
	}

	@When("user enter street name")
	public void user_enter_street_name() {
		CardPage.enterStreetName();

	}

	@When("user enter postal code")
	public void user_enter_postal_code() {
		CardPage.enterPostalCode();

	}

	@When("user enter city")
	public void user_enter_city() {
		CardPage.enterCity();

	}

	@When("user select residental status")
	public void user_select_residental_status() {
		CardPage.selectResidentialStatus();

	}

	@When("user enter IBAN")
	public void user_enter_iban() {
		CardPage.enterIBAN();

	}

	@When("user enter swift code")
	public void user_enter_swift_code() {
		CardPage.enterSwiftCode();

	}

	@When("user select bank seniority")
	public void user_select_bank_seniority() {

		CardPage.selectBankSeniority();
	}

	@When("user enter gross income")
	public void user_enter_gross_income() {
		CardPage.enterGrossIncome();

	}

	@When("user select other income source")
	public void user_select_other_income_source() {
		CardPage.selectAdditionalIncome();

	}

	@When("user select financial asset")
	public void user_select_financial_asset() {
		CardPage.selectFinancialAsset();

	}

	@When("user select professional")
	public void user_select_professional() {
		CardPage.selectProfession();

	}

	@When("user select Votre profession")
	public void user_select_votre_profession() {
		CardPage.selectProfessionDescription();

	}

	@When("user enter SIREN no")
	public void user_enter_siren_no() {
		CardPage.enterSirenNo();

	}

	@When("user enter employeer name")
	public void user_enter_employeer_name() {
		CardPage.enterEmployerName();

	}

	@When("user select employement tenure")
	public void user_select_employement_tenure() {
		CardPage.selectEmployementDuration();

	}

	@When("user enter mother name")
	public void user_enter_mother_name() {
		CardPage.enterMotherName();

	}

	@When("user enter pin code")
	public void user_enter_pin_code() {
		CardPage.enterPin();

	}

	@When("user enter confirm pin")
	public void user_enter_confirm_pin() {
		CardPage.enterConfirmPin();

	}

	@When("user select email notification")
	public void user_select_email_notification() {
		CardPage.selectEmailNotification();

	}

	@When("user select sms notification")
	public void user_select_sms_notification() {
		CardPage.selectSMSNotification();

	}

	@Then("user verify form completion status {string}")
	public void user_verify_form_completion_status(String status) {
		CardPage.verifySuccessMessage(status);

	}

}
