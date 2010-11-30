Feature: Federal Income Taxes
  Calculate Federal Income Taxes at %25 of gross pay

Scenario Outline:
  Given a gross pay of <gross_pay>
  Then we should have a federal income tax of <federal> dollars

Examples:
  | gross_pay | federal |
  | 100       | 25      |
  | 200       | 50      |
  | 150       | 37.5    |


