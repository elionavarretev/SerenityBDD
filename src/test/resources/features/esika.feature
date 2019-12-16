#AUTOMATION: elionavarretev@gmail.com

@tag
Feature: AUTOMATION

  @caso
  Scenario Outline: Flujo de compra
    Given que un invitado y entra a la web esika
    And además, selecciona <categoria> y selecciona <tipo>
    When se dirige a la ficha del producto <cualquiera>
    And agrega <cantidad> adicional
    Then agrega a la bolsa
    And se registra como <invitado>
    And se registra la dirección de <envio> y anula la compra
		Examples:
     | categoria | tipo |cualquiera| cantidad | invitado | envio |
     | PERFUMES | MADEROSA | Revolution |2 | Elio;Navarrete;elionavarretev@gmail.com;elionavarretev@gmail.com|ANCASH;AIJA;AIJA;Av Larco 23;AA;Plaza Vea;979094101|
     | PERFUMES | MADEROSA | Magnat |2 | Elio;Navarrete;enavarrete@belcorp.com;enavarrete@belcorp.com|LIMA;LIMA;LINCE;Av Canada 723;2;Belcorp;999333222|
     | PERFUMES | MADEROSA | Cardigan-Evolution |2 | Jeff;Navarrete;elio@gmail.com;elio@gmail.com|LIMA;LIMA;SURQUILLO;Av Angamos 1111;1;Parque X;900111221|
     | PERFUMES | MADEROSA | Privé Homme |2 | Elio Jeff;Navarrete;elionava@gmail.com;elionava@gmail.com|CUSCO;URUBAMBA;URUBAMBA;Av El Sol 3;6;Camino al Sol;981212231|
    