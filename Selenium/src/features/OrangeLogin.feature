Feature: Orange Login Functionality

Scenario Outline: Check Login with multiple sets of Data

Given User used on Orange Home Page

When User enters "<UserName>" and "<Password>"

Then user Validates Login Functionality

Examples:

            | UserName | Password |
            | Admin | Admin123 |
            | Manual | Admin |
            | Automation | Adminxyz |

