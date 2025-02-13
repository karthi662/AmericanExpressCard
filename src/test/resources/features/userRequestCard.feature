Feature: User request card
  
  Scenario: verify user details added successfully for card request
    Given open card page
    And user accept cookies
    When user clicks cartes american express
    And user accept cookies
    And user clicks en savoir plus under carte gold american express
    And user clicks Demandez votre Carte
    And user select gender
    And user enter first name
    And user enter last name
    And user enter date of borth
    And user enter email address
    And user select country code
    And user enter mobile number
    And user clicks submit
    And user confirm birth name same as current name
    And user enter place of birth
    And user select birth department
    And user select country
    And user select nationality
    And user select territory
    And user enter street name
    And user enter postal code
    And user enter city
    And user select residental status
    And user clicks submit
    And user enter IBAN
    And user enter swift code
    And user select bank seniority
    And user enter gross income
    And user select other income source
    And user select financial asset
    And user select professional
    And user select Votre profession
    And user enter SIREN no
    And user enter employeer name
    And user select employement tenure
    And user clicks submit
    And user enter mother name
    And user enter pin code
    And user enter confirm pin
    And user select email notification
    And user select sms notification
    And user clicks submit
    Then user verify form completion status "Merci d'avoir complété le formulaire."
    
    
