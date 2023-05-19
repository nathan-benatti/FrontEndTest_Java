#GroceryCrud Gherkin
#Author: Nathan Benatti Silva

Feature: CheckBox options
  -In order to test "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v5/" functions, will be considered:
  -AddCustomer function and options
  -Browsing through pages of the list flow
  -Checkbox options flow

  Background:
    Given User is at the bootstrap_theme_v5 page

    @ExpectedSuccessfulCheckBoxDelete
    Scenario: User selects one entry from checkbox and delete it
      Given System register the number of entries in the database
      And User clicks at CHECKBOX
      And User clicks at CHECKBOXDELETE button
      When User clicks at CONFIRMDELETE button
      Then The Entry number is updated - deleted

    @ExpectedSuccessfulCheckBoxDeleteCancel
    Scenario: User selects one entry from checkbox, click to delete, and then cancel
      Given System register the number of entries in the database
      And User clicks at CHECKBOX
      And User clicks at CHECKBOXDELETE button
      When User clicks at CANCELDELETE button
      Then The Entry number is checked to be the same

    @ExpectedSuccessfulCheckBoxDeleteClose
    Scenario: User selects one entry from checkbox, click to delete, and then close
      Given System register the number of entries in the database
      And User clicks at CHECKBOX
      And User clicks at CHECKBOXDELETE button
      When User clicks at CLOSEDELETE button
      Then The Entry number is checked to be the same





