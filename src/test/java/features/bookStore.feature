#Author: gemini.bhaskar@gmail.com
@loggedinuserexp
Feature: logged in user in bookstore application
  I want to use the bookstore website as a existed user and add some books.

  @userexperience1
  Scenario: Existing user should be able to login and add books to theor collection.
    Pre-Requisite: User should have been registered in the Book store application.

    Given I navigate to Bookstore application
    Given I logged into bookstore application using the credentials
      | UserName       | Password    |
      | bhaskar.thakur | Asdf@112233 |
    And I click on BookStore option from the menu
    And I search below list of documents and add it to my collection
      | You Don't Know JS                   |
      | Understanding ECMAScript 6          |
      | Learning JavaScript Design Patterns |
      | Git                                 |
    When I go back to my profile
    Then I should see "4" documents under my collection
    And I Logoff from the bookstore appication
