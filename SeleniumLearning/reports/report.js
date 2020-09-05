$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\feature\\ServiveNowLogin.feature");
formatter.feature({
  "name": "ServiceNow Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "Launch browswer",
  "keyword": "Given "
});
formatter.match({
  "location": "SnowLogin.launchBrowswer()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "load url",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.loadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.maximizeTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "Login serviceNow",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter username as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "SnowLogin.userEnterUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"Pass@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.userEnterPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "home page loaded",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png");
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "Launch browswer",
  "keyword": "Given "
});
formatter.match({
  "location": "SnowLogin.launchBrowswer()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "load url",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.loadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.maximizeTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "LoginServiceNow(negative)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter username as \"shefali\"",
  "keyword": "When "
});
formatter.match({
  "location": "SnowLogin.userEnterUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "SnowLogin.userEnterPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should fail",
  "keyword": "But "
});
formatter.match({
  "location": "SnowLogin.loginShouldFail()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
});