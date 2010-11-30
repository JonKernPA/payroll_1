Feature: Check or EFT
Employees are paid either by check or eft.  Checks are
mailed to the employee's home.  EFT's are transmitted
to the employee's bank acount


Scenario:
  Given the following employee data:
  | name |  rate | hours | pay_type | address   | bank_account | routing |
  | chet | 24.00 |    40 | C        | 123 Main  |              |         |
  | ron  | 30.00 |    45 | E        | 321 South |          444 |     222 |
  When payroll is run
  Then we should have the following output:
  | name |  rate | hours |   gross | destination | bank | routing |
  | chet | 24.00 |    40.00 |  960.00 | 123 Main    |      |         |
  | ron  | 30.00 |    45.00 | 1350.00 | 321 South   |  444 |     222 |





