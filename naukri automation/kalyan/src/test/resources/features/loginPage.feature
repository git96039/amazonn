Feature:naukri


  @na
Scenario Outline: login to naukri
Given User fills the login details
When User fills emailid "<mailId>"
And fills the password "<Password>"
Then User should be able to login to the naukri.
Examples:
| mailId            | Password  |
| lp.test@digite.com | lpDigite |

