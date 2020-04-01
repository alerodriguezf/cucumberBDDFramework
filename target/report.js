$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Categoria Comics",
  "description": "Como usuario quiero acceder a los comics de la web y leerlos.",
  "id": "categoria-comics",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12821276700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Ingresar en la categoría Comics desde la pantalla Home.",
  "description": "",
  "id": "categoria-comics;ingresar-en-la-categoría-comics-desde-la-pantalla-home.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "El usuario se encuentra en la pagina home de la web",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "El usuario hace click sobre el botón de little tester comics",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "La web nos redirige a la página de Categoría Comics",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.el_usuario_se_encuentra_en_la_pagina_home_de_la_web()"
});
formatter.result({
  "duration": 102550700,
  "status": "passed"
});
formatter.match({
  "location": "Test.el_usuario_hace_click_sobre_el_botón_de_little_tester_comics()"
});
formatter.result({
  "duration": 1330106600,
  "status": "passed"
});
formatter.match({
  "location": "Test.la_web_nos_redirige_a_la_página_de_Categoría_Comics()"
});
formatter.result({
  "duration": 170580900,
  "status": "passed"
});
formatter.after({
  "duration": 1137793500,
  "status": "passed"
});
});