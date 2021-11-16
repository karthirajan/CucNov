$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobileSearch.feature");
formatter.feature({
  "name": "Mobile Search validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Flipkart"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileSearchSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials and click on login",
  "keyword": "And "
});
formatter.match({
  "location": "MobileSearchSteps.user_enters_credentials_and_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validating mobile purchase by using 1 dim Map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flipkart"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user searching the mobile by one dimesional map concept",
  "rows": [
    {
      "cells": [
        "Phone1",
        "iPhone"
      ]
    },
    {
      "cells": [
        "Phone2",
        "SAMSUNG"
      ]
    },
    {
      "cells": [
        "Phone3",
        "OnePlus"
      ]
    },
    {
      "cells": [
        "Phone4",
        "Nokia"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobileSearchSteps.user_searching_the_mobile_by_one_dimesional_map_concept(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobileSearchSteps.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates into add to cart and check the order updated",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileSearchSteps.navigates_into_add_to_cart_and_check_the_order_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});