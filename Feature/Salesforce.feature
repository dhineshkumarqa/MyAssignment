Feature: Create a new account in Salesforce

Scenario: Verify user can create a new account with name and ownership set to public

Given Launch the browser
And enter the username vidyar@testleaf.com
And enter the password Sales@123
When click the login button
And click on toggle menu button from the left corner
And click on view All and click Sales App Launcher
And click on Accounts tab
And click on new button
And Enter Dhinesh kumar as Account name
And select Ownership as public
Then click save and verify Account name
