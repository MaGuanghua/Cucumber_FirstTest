$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("baiduSearch.feature");
formatter.feature({
  "line": 1,
  "name": "�ٶ�����",
  "description": "    �򿪰ٶȽ�������",
  "id": "�ٶ�����",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "�ٶ�����selenium",
  "description": "",
  "id": "�ٶ�����;�ٶ�����selenium",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Go to baidu home",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Type the search text \"selenium\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click the submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Wait the query result",
  "keyword": "Then "
});
formatter.match({
  "location": "BaiduSearchStepfs.go_to_baidu_home()"
});
formatter.result({
  "duration": 10523878589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 22
    }
  ],
  "location": "BaiduSearchStepfs.type_the_search_text(String)"
});
formatter.result({
  "duration": 229828316,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearchStepfs.click_the_submit()"
});
formatter.result({
  "duration": 105045430,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearchStepfs.wait_the_query_result()"
});
formatter.result({
  "duration": 14004011204,
  "status": "passed"
});
});