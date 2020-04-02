$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "I want to log in on the website",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14209280900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Go to the login page to perform the log in process",
  "description": "",
  "id": "login;go-to-the-login-page-to-perform-the-log-in-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the wbesite home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the log in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Website redirects user to the login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1222813000,
  "status": "passed"
});
formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Categoria Comics",
  "description": "Como usuario quiero acceder a los comics de la web y leerlos.",
  "id": "categoria-comics",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11335689200,
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
  "name": "La web nos redirige a la pagina de Categoría Comics",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.el_usuario_se_encuentra_en_la_pagina_home_de_la_web()"
});
formatter.result({
  "duration": 217161100,
  "status": "passed"
});
formatter.match({
  "location": "Test.el_usuario_hace_click_sobre_el_botón_de_little_tester_comics()"
});
formatter.result({
  "duration": 786288300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1209276000,
  "status": "passed"
});
});