package org.com.pages;

import org.com.objects.CardPageOR;
import org.com.utils.CommonResources;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardPage extends BasePage implements CardPageOR {

	private static final Logger LOG = LoggerFactory.getLogger(CardPage.class);

	public static void openPage() {
		System.out.println("enter page");
		url(CommonResources.readProperty("pageurl"));

	}

	public static void acceptCookies() {
		waitForElementToBePresent(cookies, 30);
		jsClick(element(cookies));
	}

	public static void clickCartsAmericanExpress() {
		click(waitForElementToBeClickable(cartsAmericanExpress, 10));
	}

	public static void clickSavior() {
		click(waitForElementToBeClickable(saviorPlus, 10));

	}

	public static void clickDemandez() {
		click(waitForElementToBeClickable(DemandezVotreCarte, 10));

	}

	public static void selectGender() throws InterruptedException {
		
		waitForElementToBePresent(genderMale, 20);
		if (CommonResources.readProperty("gender").equalsIgnoreCase("male")) {
			jsClick(element(genderMale));
		} else {
			jsClick(element(genderFeMale));
		}

	}

	public static void enterFirstName() {
		fill(firstName, CommonResources.readProperty("firstname"));

	}

	public static void enterLastName() {
		fill(lastName, CommonResources.readProperty("lastname"));

	}

	public static void enterDOB() {
		fill(DOB, CommonResources.readProperty("dob"));

	}

	public static void enterEmail() {
		fill(email, CommonResources.readProperty("email"));

	}

	public static void selectCountryCode() {
		selectByValue(element(countryCodeDropDown), CommonResources.readProperty("countrycode"));

	}

	public static void enterMobileNumber() {
		fill(mobileNumber, CommonResources.readProperty("phoneno"));

	}

	public static void submit() {

		waitForElementToBeClickable(submit, 10);
		jsClick(element(submit));

	}

	public static void clickCheckBoxName() throws InterruptedException {

		waitForElementToBePresent(birthNameSameCheckBox, 10);
		jsClick(element(birthNameSameCheckBox));

	}

	public static void enterBirthPlace() {
		fill(placeOfBirth, CommonResources.readProperty("placeofbirth"));

	}

	public static void selectBirthDepartment() {
		selectByValue(element(birthDepartment), CommonResources.readProperty("department"));

	}

	public static void selectCountry() {
		selectByVisibleText(element(country), CommonResources.readProperty("country"));

	}

	public static void selectNationality() {
		selectByVisibleText(element(nationality), CommonResources.readProperty("nationality"));

	}

	public static void selectTerritory() {
		selectByVisibleText(element(territory), CommonResources.readProperty("territory"));

	}

	public static void enterStreetName() {
		fill(address, CommonResources.readProperty("street"));

	}

	public static void enterPostalCode() {
		fill(postalCode, CommonResources.readProperty("postalcode"));

	}

	public static void enterCity() {
		fill(city, CommonResources.readProperty("city"));

	}

	public static void selectResidentialStatus() {
		selectByValue(element(residentialStatus), CommonResources.readProperty("ResidentialStatus"));

	}

	public static void enterIBAN() {
		fill(bankAccountNumber, CommonResources.readProperty("IBN"));

	}

	public static void enterSwiftCode() {
		fill(swiftCode, CommonResources.readProperty("swiftcode"));

	}

	public static void selectBankSeniority() {
		selectByValue(element(tenure), CommonResources.readProperty("bankseniority"));

	}

	public static void enterGrossIncome() {
		fill(annualIncome, CommonResources.readProperty("grossincome"));

	}

	public static void selectAdditionalIncome() {

		jsClick(element(additionalIncomeNo));

	}

	public static void selectFinancialAsset() {
		selectByValue(element(financialAsset), CommonResources.readProperty("asset"));

	}

	public static void selectProfession() {
		selectByValue(element(occupation), CommonResources.readProperty("profession"));

	}

	public static void selectProfessionDescription() {
		selectByValue(element(occupationDescription), CommonResources.readProperty("professiondescription"));

	}

	public static void enterSirenNo() {
		fill(sirenNumber, CommonResources.readProperty("siren"));

	}

	public static void enterEmployerName() {
		fill(employerName, CommonResources.readProperty("employeer"));

	}

	public static void selectEmployementDuration() {
		selectByValue(element(employmentDuration), CommonResources.readProperty("employementduration"));

	}

	public static void enterMotherName() {
		fill(motherName, CommonResources.readProperty("mothername"));

	}

	public static void enterPin() {
		fill(pinCode, CommonResources.readProperty("pin"));

	}

	public static void enterConfirmPin() {
		fill(confirmPin, CommonResources.readProperty("pin"));

	}

	public static void selectEmailNotification() {
		jsClick(element(emailNews));

	}

	public static void selectSMSNotification() {
		jsClick(element(smsNews));

	}

	public static void verifySuccessMessage(String message) {

		waitForElementToBePresent(formComplete, 10);
		if (element(formComplete).getText().contains(message)) {
			Assert.assertTrue(true);
			LOG.info("Form completion status veryfied successfully");
		} else {
			LOG.info(" Not getting Expected result" + element(formComplete).getText().contains(message));
			Assert.assertTrue(false);
		}

	}

}
