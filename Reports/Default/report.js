$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3624566200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify when i pass invalid credentials error message will be",
  "description": "displayed",
  "id": "login;verify-when-i-pass-invalid-credentials-error-message-will-be",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the Hotel.com homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the sign-in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter Invalid email",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter Invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign-in button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify error message is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginSD.signinLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSD.enteringInvalidemail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSD.enteringPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSD.clickSigninButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSD.verifyErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
});