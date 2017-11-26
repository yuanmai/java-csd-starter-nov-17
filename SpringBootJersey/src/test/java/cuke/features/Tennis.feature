Feature: TennisFeature
  This feature deals with the login functionality of the application


  @web
Scenario: 在12点至16点有空闲场地情况下进行预订
Given 有空闲场地情况下，在13点到15点
When 进行预订
Then 我预订成功

Scenario: 在12点至16点有空闲场地情况下进行预订
Given 有空闲场地情况下，在9点到10点
When 进行预订
Then 我预订失败

