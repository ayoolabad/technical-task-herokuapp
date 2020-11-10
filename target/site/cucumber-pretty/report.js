$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JavaScriptAlerts.feature");
formatter.feature({
  "line": 2,
  "name": "JavaScriptAlerts",
  "description": "",
  "id": "javascriptalerts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@JavaScriptAlerts"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Relevant message appears",
  "description": "",
  "id": "javascriptalerts;relevant-message-appears",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on that Welcome to the-internet page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks the JavaScript Alerts",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Click for JS Confirm",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks ok",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "relevant message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "JavaScriptAlertsSteps.userIsOnThatWelcomeToTheInternetPage()"
});
formatter.result({
  "duration": 5868067416,
  "status": "passed"
});
formatter.match({
  "location": "JavaScriptAlertsSteps.userClicksTheJavaScriptAlerts()"
});
formatter.result({
  "duration": 322229342,
  "status": "passed"
});
formatter.match({
  "location": "JavaScriptAlertsSteps.userClicksOnClickForJSConfirm()"
});
formatter.result({
  "duration": 105039049,
  "status": "passed"
});
formatter.match({
  "location": "JavaScriptAlertsSteps.userClicksOk()"
});
formatter.result({
  "duration": 15120209,
  "status": "passed"
});
formatter.match({
  "location": "JavaScriptAlertsSteps.relevantMessageAppears()"
});
formatter.result({
  "duration": 33364,
  "status": "passed"
});
});