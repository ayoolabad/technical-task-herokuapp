$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Log In",
  "description": "",
  "id": "log-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Log into Account",
  "description": "",
  "id": "log-in;log-into-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user inputs the \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the \"\u003cPassword\u003e\" given",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user then clicks on Login",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "log-in;log-into-account;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "log-in;log-into-account;;1"
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!"
      ],
      "line": 12,
      "id": "log-in;log-into-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Log into Account",
  "description": "",
  "id": "log-in;log-into-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user inputs the \"tomsmith\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the \"SuperSecretPassword!\" given",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user then clicks on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 6451312213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tomsmith",
      "offset": 17
    }
  ],
  "location": "LoginSteps.userInputsThe(String)"
});
formatter.result({
  "duration": 197726275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SuperSecretPassword!",
      "offset": 17
    }
  ],
  "location": "LoginSteps.userEntersTheGiven(String)"
});
formatter.result({
  "duration": 120475295,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userThenClicksOnLogin()"
});
formatter.result({
  "duration": 381627225,
  "status": "passed"
});
});