#AUTOMATION: elionavarretev@gmail.com

@tag
Feature: AUTOMATION

  @caso
  Scenario Outline: Flujo de compra
    Given que un invitado y entra a la web esika
    When se dirige a buscar
    Then ingresar <dato>  y selecciona buscar
    	Examples:
    |userId|id|dato|complete|
    ##@externaldata@
|1|1|delectus aut autem|false|
|1|2|quis ut nam facilis et officia qui|false|


