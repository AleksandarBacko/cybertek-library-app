Feature: Login As I user, I should be able to login

  Background: login
    Given I am on the login page
@wip
  Scenario: Login as a librarian
    When I login as a "librarian"
    Then "Dashboard" should be displayed
@wip
  Scenario: Login as a student
    When I login as a "student"
    Then "Books" should be displayed