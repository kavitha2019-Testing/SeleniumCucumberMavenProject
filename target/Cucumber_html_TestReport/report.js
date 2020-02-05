$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/kavitha/IdeaProjects/SeleniumCucumberMavenProject/Feature/AP.feature");
formatter.feature({
  "name": "AutomationPractice Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "AutomationPractice LoginPage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "APStepdefinition.user_Launch_Chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opened URL  \"https://www.freshworks.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "APStepdefinition.user_opened_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify logo of AutomationPractice",
  "keyword": "Then "
});
formatter.match({
  "location": "APStepdefinition.user_verify_logo_of_AutomationPractice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on contactUs button",
  "keyword": "When "
});
formatter.match({
  "location": "APStepdefinition.user_click_on_contactUs_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "APStepdefinition.close_browser()"
});
formatter.result({
  "status": "passed"
});
});