Feature: feature1
Scenario: feature1_scenario1
Given system is displaying "Web Examples - CrossBrowserTesting.com" page
When user clicks on "Selenium Example Page" link
Then system should display "Selenium Test Example Page" page

Scenario: feature1_scenario2
Given system is displaying "Web Examples - CrossBrowserTesting.com" page
When user clicks on "Selenium Example Page" link
Then system should display "Selenium Test Example Page" page
When user enters "mohan" in "Input Text Here" text field
Then system should display "mohan" in "Input Text Here" text field