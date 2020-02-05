Feature: Freshworks Login

Scenario: Freshworks LoginPage
  Given User Launch Chromebrowser
  When User opened URL  "https://www.freshworks.com/"
  Then User verify logo of Freshworks
  When User click on contactUs button
  And close browser