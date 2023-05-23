#GroceryCrud Gherkin
#Author: Nathan Benatti Silva

  Feature: AddCustomer options
  -In order to test "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v5/" functions, will be considered:
  -AddCustomer function and options
  -Browsing through pages of the list flow
  -Checkbox options flow

##------------------------------------------ADD CUSTOMER OPTIONS------------------------------------------------------##
  Background:
    Given User is at the bootstrap_theme_v5 page

    @ExpectedSuccessfulAddCustomerAndBacktoTheList
    Scenario: User successfully enter new customer to the database, and choose SAVE button then go back to the list
      Given System register the number of entries in the database
      And User clicks at +ADDCUSTOMER button
      And fills every textbox info
      And chooses from DROPDOWN list
      And User clicks SAVE button
      When User clicks GOBACKTOTHELIST button
      Then User is directed to previous page
      And The Entry number is updated

    @ExpectedSuccessfulAddCustomerAndGoEdit
    Scenario: User successfully enter new customer to the database, and choose SAVE button then go to edit customer
      Given System register the number of entries in the database
      And User clicks at +ADDCUSTOMER button
      And fills every textbox info
      And chooses from DROPDOWN list
      And User clicks SAVE button
      When User clicks EDITCUSTOMER button
      Then User is directed to edit page
      And User clicks CANCEL button
      And User is directed to previous page
      And The Entry number is updated


    @ExpectedSuccessfulAddCustomerBackToTheList
    Scenario: User successfully enter new customer to the database, and choose SAVEBACKTOTHELIST button
      Given System register the number of entries in the database
      And User clicks at +ADDCUSTOMER button
      And fills every textbox info
      And chooses from DROPDOWN list
      When User clicks SAVEBACKTOTHELIST button
      Then User is directed back to previous page
      And The Entry number is updated

    @ExpectedSuccessfulCanceledAddCustomer
    Scenario: User successfully enter new customer to the database, and choose Cancel button
      Given System register the number of entries in the database
      And User clicks at +ADDCUSTOMER button
      And fills every textbox info
      And chooses from DROPDOWN list
      When User clicks CANCEL button
      Then User is directed to previous page
      And The Entry number is checked to be the same













