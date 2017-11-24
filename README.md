# Account TDD Kata

This project is used to implement TDD Kata below:

**`Feature:`** Withdraw from account
  As a client of the bank
  I want to withdraw money from my account
  In order to have cash

  **`Scenario:`** An existing client withdraws from his account
      Given an existing client named"pierre-jean" with 100.0 EUR in his account
      When he withdraws 10.0 EUR from his account
      Then the new balance is 90.0 EUR


**I set up 9 tests scenarios:**

**`Test 1:`** when Empty Client Name Is Used Then Thrown Exception

**`Test 2:`** when Empty Client Name Is Used Then Thrown Exception With Message

**`Test 3:`** when No Account For Client Name Then Thrown Exception

**`Test 4:`** when No Account For Client Name Then Thrown Exception with Message

**`Test 5:`** when Account Exist With Insufficient Balance Then Thrown Exception

**`Test 6:`** when Account Exist With Insufficient Balance Then Thrown Exception

**`Test 7:`** when Account Exist With Sufficient Balance Then Withdraw

**`Test 8:`** when Account Exist With Insufficient Balance For Multiple Withdraw Then Thrown Exception

**`Test 9:`** when Account Exist With Sufficient Balance For Multiple Withdraw Then Withdraw

**`Test 10:`** when Account Exist With Sufficient Balance And Negative Amount Then Thrown Exception

**`Test 11:`** when Account Exist With Sufficient Balance And Negative Amount Then Thrown Exception With Message