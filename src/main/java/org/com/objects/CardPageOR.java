package org.com.objects;

import org.openqa.selenium.By;

public interface CardPageOR {

	
	By cookies = By.xpath("//button[text()='Tout Accepter']");
	
	By cartsAmericanExpress = By.xpath("//p[contains(text(),'Cartes American Express')]");
	
	By saviorPlus = By.xpath("(//span[text()='En savoir plus'])[2]");
	
	By DemandezVotreCarte = By.xpath("(//a[text()='Demandez votre Carte'])[1]");
	
	By genderMale = By.id("MR");
	By genderFeMale = By.id("MS");
	
	By firstName= By.name("firstName");
	By lastName = By.name("lastName");
	By DOB = By.name("fieldControl-input-dateOfBirth");
	By email = By.name("email");
	By countryCodeDropDown = By.id("countryCode");
	By mobileNumber = By.name("mobilePhoneNumber");
	By submit = By.xpath("//button[@type='submit']");
	By birthNameSameCheckBox = By.id("fieldControl-input-birthNameCheck");
	By placeOfBirth = By.name("placeOfBirth");
	By birthDepartment = By.name("departmentOfBirth");
	By country = By.name("countryOfBirth");
	By nationality = By.name("nationality");
	
	By territory = By.name("country");
	By address = By.name("residentialAddressLine2");
	By postalCode = By.name("postcode");
	By city = By.name("cityTown");
	By residentialStatus = By.name("personalResidentialStatus");
	By bankAccountNumber = By.name("fieldControl-input-bankAccountNumber");
	By swiftCode = By.name("bankIdentifierCode");
	By tenure = By.name("tenureOfAccount");
	By annualIncome = By.name("annualPersonalIncome");
	By additionalIncomeYes = By.id("hasAdditionalIncome1-YES");
	By additionalIncomeNo = By.id("hasAdditionalIncome1-NO");
	By financialAsset = By.name("totalAssets");
	By occupation =By.name("occupation");
	By occupationDescription = By.name("occupationDescription");
	By sirenNumber =By.name("sirenNumber");
	By employerName = By.name("employerName");
	By employmentDuration = By.name("employmentDuration");
	By motherName= By.name("mothersMaidenName");
	By pinCode = By.name("pin");
	By confirmPin = By.name("confirmPin");
	By emailNews = By.id("marketingEmailPreferences-true");
	By smsNews = By.id("marketingSMSPhonePostalPreferences-OPT_IN");
	By formComplete = By.xpath("//div[contains(text(),'Merci')]");
	
}
