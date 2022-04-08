$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/FacebookPage.feature");
formatter.feature({
  "name": "Facebook Page login function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FBUI"
    },
    {
      "name": "@Login"
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
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookPageSteps.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the url",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookPageSteps.user_enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Fb page login function with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FBUI"
    },
    {
      "name": "@Login"
    },
    {
      "name": "@TC01"
    },
    {
      "name": "@FBLogin"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enters the username and password",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Raja",
        "123456"
      ]
    },
    {
      "cells": [
        "Kathik",
        "123456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FacebookPageSteps.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookPageSteps.user_clicks_the_login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027login13466\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SUSI\u0027, ip: \u0027192.168.116.52\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60449}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 12399490c59461367d18e27e259876e4\n*** Element info: {Using\u003dname, value\u003dlogin13466}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.utils.LibGlobal.click(LibGlobal.java:75)\r\n\tat com.stepdef.FacebookPageSteps.user_clicks_the_login_button(FacebookPageSteps.java:55)\r\n\tat ✽.User clicks the login button(src/test/resources/FeatureFiles/FacebookPage.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User navigates to login failure page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookPageSteps.user_navigates_to_login_failure_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});