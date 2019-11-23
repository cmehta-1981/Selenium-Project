$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/cmehta/eclipse-workspace/ZerodhaProject/src/main/java/com/qa/features/ZerodhaLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Zerodha login test",
  "description": "",
  "id": "zerodha-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate Zerodha Page test",
  "description": "",
  "id": "zerodha-login-test;validate-zerodha-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user opens zerodha browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on zerodha login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user login into zerodha application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user validate zerodha homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the zerodha browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ZerodhaStepDefinition.user_opens_zerodha_browser()"
});
formatter.result({
  "duration": 14035859357,
  "status": "passed"
});
formatter.match({
  "location": "ZerodhaStepDefinition.user_is_on_zerodha_login_page()"
});
formatter.result({
  "duration": 619517136,
  "status": "passed"
});
formatter.match({
  "location": "ZerodhaStepDefinition.user_login_into_zerodha_application()"
});
formatter.result({
  "duration": 30129911803,
  "status": "passed"
});
formatter.match({
  "location": "ZerodhaStepDefinition.user_validate_zerodha_homepage_title()"
});
formatter.result({
  "duration": 47300,
  "status": "passed"
});
formatter.match({
  "location": "ZerodhaStepDefinition.user_close_the_zerodha_browser()"
});
formatter.result({
  "duration": 1491787837,
  "status": "passed"
});
});