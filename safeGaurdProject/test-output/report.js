$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/cmehta/eclipse-workspace/safeGaurdProject/src/main/java/com/qa/features/homePage.feature");
formatter.feature({
  "line": 1,
  "name": "InvestmentSafeGaurd HomePage test",
  "description": "",
  "id": "investmentsafegaurd-homepage-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "validate InvestmentSafeGaurd Home Page title  Test",
  "description": "",
  "id": "investmentsafegaurd-homepage-test;validate-investmentsafegaurd-home-page-title--test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens InvestmentSafeGaurd browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user validate InvestmentSafeGaurd home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_opens_InvestmentSafeGaurd_browser()"
});
formatter.result({
  "duration": 8200564315,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_validate_InvestmentSafeGaurd_home_page_title()"
});
formatter.result({
  "duration": 5057085242,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 871265139,
  "status": "passed"
});
});