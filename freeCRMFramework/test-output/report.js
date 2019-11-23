$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/cmehta/eclipse-workspace/freeCRMFramework/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM test application",
  "description": "",
  "id": "freecrm-test-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "FreeCRM login page scenario",
  "description": "",
  "id": "freecrm-test-application;freecrm-login-page-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@End2EndTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user on FreeCRM login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user verify the FreeCRM title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user sees username and password input fields",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user sees login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user sees Forgot your password? link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user sees Classic CRM link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user sees Sign Up link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_on_FreeCRM_login_page()"
});
formatter.result({
  "duration": 3539371079,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 76\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027LIN55000210\u0027, ip: \u0027172.20.10.5\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x01417C53+1473619]\n\tOrdinal0 [0x0139AD71+961905]\n\tOrdinal0 [0x013242B3+475827]\n\tOrdinal0 [0x012BF365+62309]\n\tOrdinal0 [0x012BBC77+48247]\n\tOrdinal0 [0x012D9149+168265]\n\tOrdinal0 [0x012D8D1D+167197]\n\tOrdinal0 [0x012D742B+160811]\n\tOrdinal0 [0x012C0AE6+68326]\n\tOrdinal0 [0x012C1BF0+72688]\n\tOrdinal0 [0x012C1B89+72585]\n\tOrdinal0 [0x013B4B37+1067831]\n\tGetHandleVerifier [0x014B6845+506677]\n\tGetHandleVerifier [0x014B65E0+506064]\n\tGetHandleVerifier [0x014BD188+533624]\n\tGetHandleVerifier [0x014B701A+508682]\n\tOrdinal0 [0x013AC226+1032742]\n\tOrdinal0 [0x013AC09F+1032351]\n\tOrdinal0 [0x013B6A4B+1075787]\n\tOrdinal0 [0x013B6BB3+1076147]\n\tOrdinal0 [0x013B5B65+1071973]\n\tBaseThreadInitThunk [0x760F343D+18]\n\tRtlInitializeExceptionChain [0x778A9802+99]\n\tRtlInitializeExceptionChain [0x778A97D5+54]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinition.StepDefinition.user_on_FreeCRM_login_page(StepDefinition.java:20)\r\n\tat ✽.When user on FreeCRM login page(C:/Users/cmehta/eclipse-workspace/freeCRMFramework/src/main/java/features/login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_FreeCRM_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_username_and_password_input_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_Forgot_your_password_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_Classic_CRM_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_Sign_Up_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "FreeCRM Forgot Password page scenario",
  "description": "",
  "id": "freecrm-test-application;freecrm-forgot-password-page-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user on Forgot my password page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user verify the Forgot my password title",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user sees email address input field",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter email address",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on Reset password button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user sees the forgot password confirmation message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_on_Forgot_my_password_page()"
});
formatter.result({
  "duration": 1966621700,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 76\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027LIN55000210\u0027, ip: \u0027172.20.10.5\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x01417C53+1473619]\n\tOrdinal0 [0x0139AD71+961905]\n\tOrdinal0 [0x013242B3+475827]\n\tOrdinal0 [0x012BF365+62309]\n\tOrdinal0 [0x012BBC77+48247]\n\tOrdinal0 [0x012D9149+168265]\n\tOrdinal0 [0x012D8D1D+167197]\n\tOrdinal0 [0x012D742B+160811]\n\tOrdinal0 [0x012C0AE6+68326]\n\tOrdinal0 [0x012C1BF0+72688]\n\tOrdinal0 [0x012C1B89+72585]\n\tOrdinal0 [0x013B4B37+1067831]\n\tGetHandleVerifier [0x014B6845+506677]\n\tGetHandleVerifier [0x014B65E0+506064]\n\tGetHandleVerifier [0x014BD188+533624]\n\tGetHandleVerifier [0x014B701A+508682]\n\tOrdinal0 [0x013AC226+1032742]\n\tOrdinal0 [0x013AC09F+1032351]\n\tOrdinal0 [0x013B6A4B+1075787]\n\tOrdinal0 [0x013B6BB3+1076147]\n\tOrdinal0 [0x013B5B65+1071973]\n\tBaseThreadInitThunk [0x760F343D+18]\n\tRtlInitializeExceptionChain [0x778A9802+99]\n\tRtlInitializeExceptionChain [0x778A97D5+54]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinition.StepDefinition.user_on_Forgot_my_password_page(StepDefinition.java:103)\r\n\tat ✽.When user on Forgot my password page(C:/Users/cmehta/eclipse-workspace/freeCRMFramework/src/main/java/features/login.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Forgot_my_password_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_email_address_input_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enter_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Reset_password_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_sees_the_forgot_password_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "FreeCRM login test scenario",
  "description": "",
  "id": "freecrm-test-application;freecrm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user on FreeCRM login page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user verify the FreeCRM title",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user verify the FreeCRM title again",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_on_FreeCRM_login_page()"
});
formatter.result({
  "duration": 2034860263,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 76\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027LIN55000210\u0027, ip: \u0027172.20.10.5\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x01417C53+1473619]\n\tOrdinal0 [0x0139AD71+961905]\n\tOrdinal0 [0x013242B3+475827]\n\tOrdinal0 [0x012BF365+62309]\n\tOrdinal0 [0x012BBC77+48247]\n\tOrdinal0 [0x012D9149+168265]\n\tOrdinal0 [0x012D8D1D+167197]\n\tOrdinal0 [0x012D742B+160811]\n\tOrdinal0 [0x012C0AE6+68326]\n\tOrdinal0 [0x012C1BF0+72688]\n\tOrdinal0 [0x012C1B89+72585]\n\tOrdinal0 [0x013B4B37+1067831]\n\tGetHandleVerifier [0x014B6845+506677]\n\tGetHandleVerifier [0x014B65E0+506064]\n\tGetHandleVerifier [0x014BD188+533624]\n\tGetHandleVerifier [0x014B701A+508682]\n\tOrdinal0 [0x013AC226+1032742]\n\tOrdinal0 [0x013AC09F+1032351]\n\tOrdinal0 [0x013B6A4B+1075787]\n\tOrdinal0 [0x013B6BB3+1076147]\n\tOrdinal0 [0x013B5B65+1071973]\n\tBaseThreadInitThunk [0x760F343D+18]\n\tRtlInitializeExceptionChain [0x778A9802+99]\n\tRtlInitializeExceptionChain [0x778A97D5+54]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinition.StepDefinition.user_on_FreeCRM_login_page(StepDefinition.java:20)\r\n\tat ✽.When user on FreeCRM login page(C:/Users/cmehta/eclipse-workspace/freeCRMFramework/src/main/java/features/login.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_FreeCRM_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_FreeCRM_title_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});