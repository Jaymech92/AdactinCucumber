$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Adactin.feature");
formatter.feature({
  "name": "To validate adactin hotel app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Adactin"
    }
  ]
});
formatter.scenario({
  "name": "To check Adactin hotel booking functionality is working as per requirement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Adactin"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch brouser and open application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.launch_brouser_and_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter credential and click login",
  "rows": [
    {
      "cells": [
        "8807879064",
        "jayprakash"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.enter_credential_and_click_login(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter room details and click search",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.enter_room_details_and_click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.select_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter personal details and click Book",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.enter_personal_details_and_click_Book()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete all procedure for cancellation and click logout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.complete_all_procedure_for_cancellation_and_click_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout succesfully and Home page opens",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.logout_succesfully_and_Home_page_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});