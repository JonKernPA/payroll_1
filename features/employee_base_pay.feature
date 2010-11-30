Feature: Base pay calculation
  Employee's base pay is equal to hourly rate * hours worked


Scenario: Calculate Ron's pay
  Given an employee named Ron
  And an hourly rate of 10 dollars
  When he works 40 hours
  Then his base pay should be 400 dollars

Scenario: Calculate Chet's pay
  Given an employee named Chet
  And an hourly rate of 11 dollars
  When he works 20 hours
  Then his base pay should be 220 dollars
